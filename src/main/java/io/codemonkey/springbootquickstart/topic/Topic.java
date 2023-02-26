package io.codemonkey.springbootquickstart.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;
}
