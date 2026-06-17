package ch07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPostTest {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "user1";
    private static final String DB_PASSWORD = "1111";


    public static void main(String[] args){
//        findAll();  // 게시글 조회
//        insert(2, "2번이 등록한 게시글", "안녕하세요. 자바 공부 해요.");   // 게시글 등록
//        findById(10);   // 10번 게시글 작성자 아이디 조회
//        update(10, "수정된 10번 게시글", "수정했어요"); // 10번 게시글 수정
//        findAll();  // 게시글 조회
        delete(10); // 10번 게시글 삭제
        findAll();  // 게시글 조회
    }

    // 등록(C)
    static void insert(int member_Id, String title, String content){
        Connection conn = null;
        Statement stmt = null;

        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            stmt = conn.createStatement();

            int affectRows = stmt.executeUpdate("INSERT INTO post (member_id, title, content) VALUES \n" +
                    "(2, '번이 등록한 게시글', '안녕하세요. 자바 공부 해요.')");
            System.out.println("게시글 등록 완료 : " + affectRows + "건이 완료되었습니다.");

        }catch (Exception e){
            System.out.println("에러 발생 : " + e);
            e.printStackTrace();

        }finally{
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 목록 조회(R)
    static void findAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행(SELECT)
            // 4. 결과 수신(ResultSet 객체 생성)
            rs = stmt.executeQuery("SELECT * FROM post");

            while(rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");

                System.out.println("post_id: " + id + ", 제목: " + title + ", 게시글: " + content);
            }

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(rs != null) rs.close(); } catch (Exception e){ }
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 한건 조회(R)
    static void findById(int id){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행(SELECT)
            // 4. 결과 수신(ResultSet 객체 생성)
            rs = stmt.executeQuery("SELECT * FROM post where id = "+ id);
            rs.next();

                int id2 = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");

                System.out.println("post_id: " + id2 + ", 제목: " + title + ", 게시글: " + content);


        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(rs != null) rs.close(); } catch (Exception e){ }
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 수정(U)
    static void update(int id, String title, String content){
        Connection conn = null;
        Statement stmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행
            int affectedRows = stmt.executeUpdate(
                    "UPDATE post SET title = '"+title+"', content = '"+content+"' WHERE id = " + id);

            System.out.println("게시글 수정 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 삭제(D)
    static void delete(int id){
        Connection conn = null;
        Statement stmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행
            int affectedRows = stmt.executeUpdate("DELETE FROM post WHERE id=" + id);

            System.out.println("게시글 삭제 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

}