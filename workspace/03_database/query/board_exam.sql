-- 1. 게시글 목록 조회 (작성자 이름, 댓글 수 포함, 최신 등록순 정렬)
-- 작성한지 24시간 이내의 게시글 제목 앞에 (New) 추가
-- 댓글이 3개 이상 달린 게시글 제목 앞에 (Best) 추가



-- 2. 게시글 상세 조회 (게시글 제목, 내용, 작성자 이름, 이메일, 댓글 작성자 이름, 댓글 내용 조회)
select p.title 게시글_제목, p.content 게시글_내용, p.member_id 게시글_작성자, m.email 이메일, r.member_id 댓글_작성자_이름, r.content 댓글_내용
from post p
left join reply as r on p.id = r.id
left join member as m on p.id = m.id;

-- 3. 게시글 등록 (새로운 게시글 작성)
insert into post(member_id, title, content, created_at) values (3, '1번 문제가 힘들어요..', '머리가 아프네요 ㅜㅜ', '2026-06-16 17:08:30')

-- 4. 게시글 수정 (2번 게시글의 제목과 내용 변경)
select * from post where id = 2;
update post
	set title = '2번 게시글 제목 수정',
		content = '2번 게시글 내용 변경'
where id = 2;
		
-- 5. 게시글 삭제 (3번에서 등록한 게시글 삭제)
select * from post where id = 3;
delete from post
	where id = 3;

-- 6. 게시글 검색 (제목 또는 내용에 '자바'가 포함된 게시글 조회)
select title, content
	from post 
	where title like '%자바%'
	

-- 7. 게시글 페이징 조회 (최신순으로 2페이지 분량의 게시글 10건 조회)
select id, title, created_at
from post
order by created_at desc 
limit 2, 10;
