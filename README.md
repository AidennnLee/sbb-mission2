## 프로젝트 개요

[점프 투 스프링부트](https://wikidocs.net/book/7601)를 수행하며 웹 개발 공부를 하기 위한 프로젝트(2회차)

Github 링크는 [다음](https://github.com/AidennnLee/sbb-mission2.git)

### Controller

- HelloController : 환영 페이지
- MainController : SBB 환영 페이지, 루트 페이지
- QuestionController : 질문 목록 페이지

### Package

#### question

- Question : 질문 엔티티
- QuestionRepository : 질문 엔티티 관련 처리
- QuestionController : 질문 관련 컨트롤러
- QuestionService : 질문 관련 처리 담당

#### answer

- Answer : 답변 엔티티
- AnswerRepository : 답변 엔티티 관련 처리
- AnswerController : 답변 관련 컨트롤러
- AnswerService : 답변 관련 처리 담당

#### user

### Templete

- question_list : 질문 목록 페이지
- question_detail : 질문 상세 페이지

### Entity

#### 질문(Question) 엔티티

|속성명|	설명|
|--|--|
|id|	질문의 고유 번호|
|subject|	질문의 제목|
|content|	질문의 내용|
|create_date|	질문을 작성한 일시|

#### 답변(Answer) 엔티티

|속성명| 	설명         |
|--|-------------|
|id| 	답변의 고유 번호  |
|question| 	질문         |
|content| 	답변의 내용     |
|create_date| 	답변을 작성한 일시 |

### Exception

- DataNotFoundException : 값이 존재하지 않는 경우

### style.css

화면 디자인을 위한 스타일시트(stylesheet, CSS파일)