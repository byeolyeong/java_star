-- 문자열 관련 함수
-- 회원 이름 조회
select name email, CONCAT(name, '(', email, ')') as member_info
from member;

-- 각 회원의 이메일 바이트 크기 조회
select email, length('hello'), length('안녕하세요'), length(email) as eamil_length
from member;

-- 게시글 본문 중 '안녕하세요'가 있는 내용을 찾아서 HI 로 수정
select content, replace(content, '안녕하세요', 'HI!') as relaced_content
from post
where content like '%안녕하세요%'

-- 게시글 본문의 첫 10글자만 미리보기로 가져오기
-- 잘린 뒷 부분은 ... 으로 표시하세요.
select title, concat(SubString(title, 1, 10), '...') as preview
from post;

-- 이메일을 대/소문자로 조화
select email, lower(email) as email_lower, Upper(email) as email_Upper
from member;

-- 이메일 앞뒤 공백 제거
select email, trim(email) as trimmed_email
from member;


-- 날짜 관련 함수
-- 현재 날짜와 시간을 조회
select now() as current_datatime;

-- 게시글 작성일을 "연 월 일 요일 시 분 초" 형태로 조회
-- %y는 2자리 년도만 표현, %Y는 4자리 년도 표현(월, 일도 똑같음. 대소문자에 따라 표현하는 자릿수가 다름)
-- (시간 관련은 H를 쓸 경우 24시 단위로 표현, %W를 하면 영문으로 표현해줌, %w는 요일 표현을 약식으로 함)
select id, title, date_format(created_at, '%Y년 %m월 %d일 %W %H시 %i분 %s초') as write_date
from post;

-- 날짜만 조회
-- 같은 예약어는 사용 불가능.
select curdate() as curr_date;

-- 오늘 작성된 게시글만 조회
select id, title, created_at
from post