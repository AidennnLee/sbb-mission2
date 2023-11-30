package com.mysite.sbb2.question;

import com.mysite.sbb2.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository를 상속할 때는 제네릭스 타입으로 리포지터리의 대상이 되는 엔티티의 타입과 해당 엔티티의 PK의 속성 타입을 지정해야 한다.
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
}
