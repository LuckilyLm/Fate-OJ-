package com.fate.oj.model.dto.questionsubmit;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建题目提交请求
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {


    /**
     * 编程语言
     */
    private String language;

    /**
     * 代码
     */
    private String code;

    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}