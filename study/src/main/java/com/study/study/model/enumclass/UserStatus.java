package com.study.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  UserStatus {
    REGISTERED(1,"등록", "유저등록상태"),
    UNREGISTERED(2, "해지", "유저해지상태"),
    WAITING(3, "대기", "유저대기상태");

    private final Integer id;
    private final String title;
    private final String description;
}
