package com.staging.frame.web.model;

import com.staging.frame.web.annotation.Column;
import com.staging.frame.web.annotation.Table;
import com.staging.frame.web.constants.MySqlTypeConstant;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Created by Li B.
 * @date Created in 2018/6/22.
 */
@Setter
@Getter
@ToString
@Table(name = "t_frame_evaluation")
public class Evaluation extends BaseModel {
    private static final long serialVersionUID = -1345558412380742743L;

    /**
     * 评论人
     */
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR)
    private String name;
    /**
     * 评论内容
     */
    @Column(name = "evaluation", type = MySqlTypeConstant.VARCHAR)
    private String evaluation;
    /**
     * 评论类型，书籍b，个人p
     */
    @Column(name = "evaluation_type", type = MySqlTypeConstant.VARCHAR)
    private String evaluationType;

}
