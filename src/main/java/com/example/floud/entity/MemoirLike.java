package com.example.floud.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MemoirLike {
    @Id
    @GeneratedValue
    private Long memoir_like_id;


    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column
    private LocalDate likeDate;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "memoir_id")
    private Memoir memoir;

    @JsonManagedReference
    @OneToMany(mappedBy = "memoirLike", cascade = CascadeType.ALL)
    private List<Alarm> alarmList = new ArrayList<>();
}
