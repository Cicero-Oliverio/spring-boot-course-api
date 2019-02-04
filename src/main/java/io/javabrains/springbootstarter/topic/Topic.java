package io.javabrains.springbootstarter.topic;

import lombok.*;


@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Topic {

    private String id;
    private String name;
    private String description;

}
