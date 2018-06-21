package com.staging.frame.web.model;

import com.staging.frame.web.annotation.Column;
import com.staging.frame.web.annotation.Table;
import com.staging.frame.web.constants.MySqlTypeConstant;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Created by Li B.
 * @date Created in 2018/6/21.
 */
@Setter
@Getter
@ToString
@Table(name = "t_frame_menu")
public class HeaderMenu extends BaseModel {

    private static final long serialVersionUID = 8230806154896529374L;

    @Column(name = "menu_name",type = MySqlTypeConstant.VARCHAR)
    private String name;
    @Column(name = "menu_url",type = MySqlTypeConstant.VARCHAR)
    private String url;
}
