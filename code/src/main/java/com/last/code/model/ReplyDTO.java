package com.last.code.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {

    private int reply_pno;
    private int reply_user_fno;
    private LocalDate reply_date;
    private int reply_feed_fno;
    private String reply_content;

}
