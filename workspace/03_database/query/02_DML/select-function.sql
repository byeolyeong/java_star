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
where created_at >= curdate();

-- 최근 7일 이내에 가입한 회원 조회
select id, name, created_at, curdate(), date_sub(curdate(), interval 7 day) as before_7days
from member
-- (현재시간에서(), 7일을 뺴라)
where created_at >= date_sub(curdate(), interval 7 day);

-- 가입한지 1개월이 지난 회원 조회
select *, date_sub(curdate(), interval 1 month) as before_1month
from member
where created_at < date_sub(curdate(), interval 1 month);

-- 가입한지 35일 12시간이 지난 회원 조회
select *, date_sub(curdate(), interval '33 12' day_hour) as before_1month_day
from member
where created_at < date_sub(curdate(), interval '34 12' day_hour);

-- 각 회원의 가입 경과일수 조회
select name, created_at, datediff(curdate(), created_at ) as days_since_join
from member;

-- 모든 회원 수 조회
select count(*)
from member;

-- 모든 게시글 수 조회
select count(*)
from post;

-- id=3 인 회원의 총 게시글 수 조회
select member_id, view_count, count(*) as total_count
from post
where member_id=3;

-- id=3인 회원의 모든 게시글의 조회수 조회
select member_id, count(*) as total_count
from post
where member_id=3;

-- id=3인 회원의 모든 게시글의 총 조회수
select member_id, count(*) as total_counts, sum(view_count) as total_views, avg(view_count) as avg_views, min(view_count) as min_views, max(view_count) as max_views
-- , title
from post
where member_id=3;

select title
from post
where member_id = 3;

-- 전화번호가 null인 회원은 '미등록'으로 표시하여 조회
select name, ifnull(phone, '미등록') as phone
from member;

-- 전화번호가 null이면 이메일을, 이메일도 null이면 '연락처 없음'으로 조회
select name, ifnull(phone, ifnull(email, '연락처 없음')) as contact
from member;
select name, coalesce(phone, email, ' 연락처 없음') as contact
from member;
select name, if(phone is null, if(email is null, "연락처 없음", email), phone) as phone_status
from member;

-- 전화번호 등록 여부에 따라서 상태를 다르게 표시
select name, if(phone is null, '연락처 없음', '연락처 있음') as phone_status
from member;

-- 가입연도가 1년이 넘었으면 '우수 회원', 1달이 넘었으면 '일반회원', 그렇지 않으면 '신규 회원'을 출력
select 
	name, 
	created_at,
	case 
		when created_at < date_sub(now(), interval 1 year) then '우수 회원'
		when created_at < date_sub(now(), interval 1 month) then '일반 회원'
		else '신규 회원'
	end as mamber_grade
from member;


