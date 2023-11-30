package com.mysite.sbb2.question;

import com.mysite.sbb2.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {

    @Id //PK로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue : 데이터 저장 시 1씩 자동 증가. GenerationType.IDENTITY : 해당 컬럼만의 독립적인 시퀀스를 생성
    private Integer id; //기본 타입이 아닌 객체를 이용하는 이유 : 먼저 생성 후 값을 넣어주는데, 이 때 null로 둘 수 있기 때문.

    @Column(length = 200) //제목은 200자로 제한함
    private String subject;

    @Column(columnDefinition = "TEXT") //내용은 글자수 제한하지 않음.
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) //CascadeType.REMOVE : 질문을 삭제하면 그에 달린 답변들도 모두 함께 삭제하기 위함
    private List<Answer> answerList;
}
