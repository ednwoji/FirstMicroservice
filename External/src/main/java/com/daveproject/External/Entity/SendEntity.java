package com.daveproject.External.Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "sending")
public class SendEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Sendingid;


    @NotNull
    @Column(name = "sendingaccnum", unique = true)
    private String sendingaccno;

    @NotNull
    @Column(name = "customers")
    private String cusnames;

    @NotNull
    @Column(unique = true)
    private String cusname;

}
