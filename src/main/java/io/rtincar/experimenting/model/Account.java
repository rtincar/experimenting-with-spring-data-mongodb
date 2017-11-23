package io.rtincar.experimenting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {

    @Id
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Date createdAt;


}
