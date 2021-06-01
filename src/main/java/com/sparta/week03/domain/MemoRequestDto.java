package com.sparta.week03.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public class MemoRequestDto {
    private String username;
    private String contents;
}
