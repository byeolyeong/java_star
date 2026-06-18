SELECT * FROM post;

SELECT * FROM MEMBER;


-- 2번 회원 탈퇴 시 게시글 삭제 옵션을 선택한 경우.

start transaction;

-- 2번 회원 게시글 먼저 삭제
DELETE FROM post WHERE member_id = 2;

-- 2번 회원 삭제
DELETE FROM member WHERE id = 2;


-- // 정상 완료(DB에 반영)
commit;

-- 오류 발생시 원상 복구
rollback;

-- 현재 격리 수준 확인
select @@transaction_isolation;