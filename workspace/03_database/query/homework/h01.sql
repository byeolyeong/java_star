-- 주말 과제입니다.
-- 각 번호 아래에 sql을 작성해서 테스트 하세요.

-- 1. post 테이블에 조회수(view_count) 컬럼을 추가하세요.(4바이트 정수형, NOT NULL, 기본값 0)
ALTER TABLE post ADD view_count int NOT null default 0; 

-- 2. post 테이블에 샘플 게시글 20개를 추가하세요.
-- 조회수와 작성일은 기본값(CURRENT_TIMESTAMP) 대신 각각 다른 값으로 직접 입력하세요.
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (5, '첫 번째 게시글', '샘플1', '2026-06-03 09:15:16', 7);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (4, '두 번째 게시글', '샘플2', '2026-06-04 13:21:15', 10);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (4, '세 번째 게시글', '샘플3', '2026-06-08 09:33:48', 1);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (4, '네 번째 게시글', '샘플4', '2026-06-09 14:21:30', 9);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (2, '다섯 번째 게시글', '샘플5', '2026-06-09 15:01:54', 15);

INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (4, '여섯 번째 게시글', '데이터베이스 기초.', '2026-06-11 09:31:14', 11);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (4, '여섯 번째 게시글', 'Java 기초.', '2026-05-20 11:20:59', 8);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (1, '여덟 번째 게시글', '연산자, if문, if-else문', '2026-05-21 10:13:58', 6);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (2, '아홉 번째 게시글', 'if, if-else문 복습.', '2026-05-24 09:08:04', 5);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (1, '열 번째 게시글', 'switch문, while문, for문', '2026-05-24 10:21:54', 4);

INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (2, '열 한 번째 게시글', '안녕하세요. 배열 선언, 생성, 초기화에 대해 알아봅시다.', '2026-05-27 11:11:11', 11);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (2, '열 두 번째 게시글', '다차원 배열, 강화된 for문', '2026-05-28 13:33:26', 10);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (3, '열 세 번째 게시글', '배열의 복사, Arrays 클래스', '2026-05-29 10:13:20', 12);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (1, '열 넷 번째 게시글', '메서드 선언과 호출, main 메소드', '2026-06-01 13:11:44', 6);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (5, '열 다섯 번째 게시글', '명령행 매개변수, 메서드 오버로딩', '2026-06-02 10:21:09', 2);

INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (5, '열 여섯 번째 게시글', '객체지향 프로그래밍(OOP) 기초', '2026-06-03 09:15:16', 7);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (4, '열 일곱 번째 게시글', '상속, 메서드 오버라이딩, Object 클래스', '2026-06-04 13:21:15', 10);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (4, '열 여덟 번째 게시글', '다형성, 추상클래스, 인터페이스', '2026-06-08 09:33:48', 1);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (4, '열 아홉 번째 게시글', 'String 클래스, Wrapper 클래스, Math 클래스', '2026-06-09 14:21:30', 9);
INSERT INTO post (member_id, title, content, created_at, view_count)  VALUES (2, '스무 번째 게시글', 'Math 클래스, Scanner 클래스, Random 클래스', '2026-06-09 15:01:54', 15);



-- 3. reply 테이블에 샘플 댓글 30개를 추가하세요.(작성일은 기본값 대신 각각 다른 값으로 직접 입력하세요.)
-- 작성일은 기본값(CURRENT_TIMESTAMP) 대신 각각 다른 값으로 직접 입력하세요.

INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (17, 2, '샘플 댓글 1', '2026-06-04 15:49:02');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (14, 3, '샘플 댓글 2', '2026-06-01 21:09:51');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 1, '샘플 댓글 3', '2026-05-29 12:00:00');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 3, '샘플 댓글 4', '2026-05-29 13:13:13');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (7, 1, '샘플 댓글 5', '2026-05-20 21:20:59');

INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 2, '주요 데이터 타입엔 어떤 것이 있나요?', '2026-06-11 19:31:14');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 3, '데이터베이스를 실수로 삭제하는 일이 없어야겠네요.', '2026-06-11 11:01:24');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (11, 1, '배열은 선언과 동시에 초기화가 가능하네요', '2026-05-27 17:59:21');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (7, 2, '컴파일러와 인터프리터의 차이점은 어떤 것이 있나요?', '2026-05-20 19:16:30');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 1, 'MySQL 설치중 ~~ 오류가 발생했는데, 어떻게 해결을 하면 되나요?', '2026-06-11 16:01:26');

INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (8, 2, 'if, else-if, else문의 중괄호 생략 규칙에 대해 알려주세요!', '2026-05-21 10:30:15');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (12, 3, '다차원 배열은 어떨때 쓰는게 좋은가요?', '2026-05-29 09:01:03');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (20, 1, 'Math 클래스에 대해 조금 더 알고싶습니다', '2026-06-09 23:23:23');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (18, 3, '다형성이 조금 어렵네요..', '2026-06-08 18:26:21');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (11, 3, '배열에 대한 내용을 자세히 알려주셔서 감사합니다', '2026-05-27 13:01:01');

INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (14, 2, '메서드 선언과 호출에 대해 조금 더 자세히 알고싶습니다', '2026-06-01 14:14:14');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (16, 3, '객체지향 프로그램에 대해 알게되었네요.', '2026-06-03 11:21:16');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 1, '샘플 댓글 18', '2026-06-09 23:49:54');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (20, 1, '샘플 댓글 18', '2026-06-09 23:49:54');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 3, '샘플 댓글 19', '2026-06-01 15:11:21');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (14, 1, '샘플 댓글 20', '2026-06-01 18:34:00');

INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (17, 2, '샘플 댓글 21', '2026-06-04 15:49:02');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (14, 3, '샘플 댓글 22', '2026-06-01 21:09:51');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 1, '샘플 댓글 23', '2026-05-29 12:00:00');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 3, '샘플 댓글 24', '2026-05-29 13:13:13');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (7, 1, '샘플 댓글 25', '2026-05-20 21:20:59');

INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 2, '샘플 댓글 26', '2026-05-24 20:08:04');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 3, '샘플 댓글 27', '2026-05-24 22:01:34');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 1, '샘플 댓글 28', '2026-05-29 11:01:48');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (17, 1, '샘플 댓글 29', '2026-06-04 16:44:18');
INSERT INTO reply (post_id, member_id, content, created_at)  VALUES (6, 1, '샘플 댓글 30', '2026-06-03 11:34:15');



-- 4. post 테이블에서 조회수(view_count)가 10회 이상인 게시글의 제목, 조회수를 조회하세요.
SELECT title, view_count
    FROM post
    WHERE view_count >= 10;	-- ~ 이상 ~ 이하이면 결과가 나옴

-- 5. post 테이블에서 2번 회원(member_id = 2)이 작성한 모든 게시글의 작성자, 제목, 작성일을 최신순(작성일 내림차순)으로 조회하세요.
SELECT member_id, title, created_at 
    FROM post
    WHERE member_id IN (2)
	order by created_at desc;
	
-- 6. post 테이블에서 본문(content)에 '안녕'이 들어간 게시글 목록의 모든 컬럼을 최신순(작성일 내림차순)으로 조회하세요.
SELECT id, title, content, created_at
    FROM post
    WHERE content LIKE '%안녕%'
	order by created_at desc;

-- 7. reply 테이블에서 3번 게시글(post_id = 3)에 달린 모든 댓글의 게시글 id, 본문, 작성일을 오래된 순(작성일 오름차순)으로 조회하세요.
select * from post where id = 3; 

select post_id , content, created_at
	from reply
	order by post_id asc, content asc, created_at asc


-- 8. 1페이지당 5개씩 게시글 목록을 보여줄 때 조회수(view_count)가 높은 순서대로 정렬하고 3페이지 게시글 목록의 id, 제목, 조회수를 조회하세요.
SELECT id, title, view_count
    FROM post
    ORDER BY view_count desc
    LIMIT 10, 5;

-- 과제가 완료되면 본인의 github 레포지토리에 push 하세요.