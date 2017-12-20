package com.xianjinxia.pojo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

@TableName("user_info")
public class User_info extends Model<User_info> {
  private Integer id;
  private String user_name;
  private String password;
  private String pay_password;
  private String realname;
  private Long realname_status;
  private java.sql.Timestamp realname_time;
  private Long real_count;
  private java.sql.Date last_full_time;
  private String id_number;
  private String user_sex;
  private Long user_age;
  private String qq;
  private String user_phone;
  private String taobao_account;
  private String email;
  private String wechat_account;
  private Long education;
  private Long marital_status;
  private String present_address;
  private String present_address_distinct;
  private String present_latitude;
  private String present_longitude;
  private Long present_period;
  private String company_name;
  private String company_address;
  private String company_address_distinct;
  private String company_longitude;
  private String company_latitude;
  private String company_phone;
  private Long company_period;
  private String first_contact_name;
  private String first_contact_phone;
  private Long frist_contact_relation;
  private String second_contact_name;
  private String second_contact_phone;
  private Long second_contact_relation;
  private java.sql.Timestamp create_time;
  private String create_ip;
  private java.sql.Timestamp update_time;
  private Long status;
  private Long invite_userid;
  private Long is_save;
  private String head_portrait;
  private String idcard_img_z;
  private String idcard_img_f;
  private Long customer_type;
  private Long amount_min;
  private Long amount_max;
  private Long amount_available;
  private Long amount_addsum;
  private java.sql.Timestamp js_amount_time;
  private String equipment_number;
  private Double zm_score;
  private java.sql.Timestamp zm_score_time;
  private Long zm_industy_black;
  private Long zm_over;
  private Long zm_no_pay_over;
  private java.sql.Timestamp zm_industy_time;
  private Long zm_status;
  private Double my_hb;
  private java.sql.Timestamp my_hb_time;
  private String jxl_token;
  private java.sql.Timestamp jxl_token_time;
  private Long jxl_status;
  private String jxl_detail;
  private java.sql.Timestamp jxl_detail_time;
  private Long jxl_detail_status;
  private Long jxl_zj_dk_num;
  private Long jxl_bj_dk_num;
  private Double jxl_yj_hf;
  private Long jxl_link2_days;
  private Long jxl_link1_days;
  private Long jxl_link2_num;
  private Long jxl_link1_num;
  private Long jxl_link2_order;
  private Long jxl_link1_order;
  private Long jxl_gj_ts;
  private Long jxl_total;
  private Double jxl_gj_bl;
  private Long jxl_lx_gj_ts;
  private Long jxl_ht_phone_num;
  private Long jxl_amth_num;
  private Long jxl_phone_reg_days;
  private java.sql.Timestamp jxl_time;
  private Long jxl_realname;
  private Long go_am_num;
  private Long jxl_same_phone_card;
  private Long zjlxr_black;
  private Long jjlxr_black;
  private Long yqjj_black;
  private Long user_contact_size;
  private Long history_over_num;
  private Long last_over_days;
  private Long csjy;
  private String user_from;
  private Long new_flag;
  private String province;
  private String tg;
  private String tg_flag;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPay_password() {
    return pay_password;
  }

  public void setPay_password(String pay_password) {
    this.pay_password = pay_password;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public Long getRealname_status() {
    return realname_status;
  }

  public void setRealname_status(Long realname_status) {
    this.realname_status = realname_status;
  }

  public java.sql.Timestamp getRealname_time() {
    return realname_time;
  }

  public void setRealname_time(java.sql.Timestamp realname_time) {
    this.realname_time = realname_time;
  }

  public Long getReal_count() {
    return real_count;
  }

  public void setReal_count(Long real_count) {
    this.real_count = real_count;
  }

  public java.sql.Date getLast_full_time() {
    return last_full_time;
  }

  public void setLast_full_time(java.sql.Date last_full_time) {
    this.last_full_time = last_full_time;
  }

  public String getId_number() {
    return id_number;
  }

  public void setId_number(String id_number) {
    this.id_number = id_number;
  }

  public String getUser_sex() {
    return user_sex;
  }

  public void setUser_sex(String user_sex) {
    this.user_sex = user_sex;
  }

  public Long getUser_age() {
    return user_age;
  }

  public void setUser_age(Long user_age) {
    this.user_age = user_age;
  }

  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public String getUser_phone() {
    return user_phone;
  }

  public void setUser_phone(String user_phone) {
    this.user_phone = user_phone;
  }

  public String getTaobao_account() {
    return taobao_account;
  }

  public void setTaobao_account(String taobao_account) {
    this.taobao_account = taobao_account;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getWechat_account() {
    return wechat_account;
  }

  public void setWechat_account(String wechat_account) {
    this.wechat_account = wechat_account;
  }

  public Long getEducation() {
    return education;
  }

  public void setEducation(Long education) {
    this.education = education;
  }

  public Long getMarital_status() {
    return marital_status;
  }

  public void setMarital_status(Long marital_status) {
    this.marital_status = marital_status;
  }

  public String getPresent_address() {
    return present_address;
  }

  public void setPresent_address(String present_address) {
    this.present_address = present_address;
  }

  public String getPresent_address_distinct() {
    return present_address_distinct;
  }

  public void setPresent_address_distinct(String present_address_distinct) {
    this.present_address_distinct = present_address_distinct;
  }

  public String getPresent_latitude() {
    return present_latitude;
  }

  public void setPresent_latitude(String present_latitude) {
    this.present_latitude = present_latitude;
  }

  public String getPresent_longitude() {
    return present_longitude;
  }

  public void setPresent_longitude(String present_longitude) {
    this.present_longitude = present_longitude;
  }

  public Long getPresent_period() {
    return present_period;
  }

  public void setPresent_period(Long present_period) {
    this.present_period = present_period;
  }

  public String getCompany_name() {
    return company_name;
  }

  public void setCompany_name(String company_name) {
    this.company_name = company_name;
  }

  public String getCompany_address() {
    return company_address;
  }

  public void setCompany_address(String company_address) {
    this.company_address = company_address;
  }

  public String getCompany_address_distinct() {
    return company_address_distinct;
  }

  public void setCompany_address_distinct(String company_address_distinct) {
    this.company_address_distinct = company_address_distinct;
  }

  public String getCompany_longitude() {
    return company_longitude;
  }

  public void setCompany_longitude(String company_longitude) {
    this.company_longitude = company_longitude;
  }

  public String getCompany_latitude() {
    return company_latitude;
  }

  public void setCompany_latitude(String company_latitude) {
    this.company_latitude = company_latitude;
  }

  public String getCompany_phone() {
    return company_phone;
  }

  public void setCompany_phone(String company_phone) {
    this.company_phone = company_phone;
  }

  public Long getCompany_period() {
    return company_period;
  }

  public void setCompany_period(Long company_period) {
    this.company_period = company_period;
  }

  public String getFirst_contact_name() {
    return first_contact_name;
  }

  public void setFirst_contact_name(String first_contact_name) {
    this.first_contact_name = first_contact_name;
  }

  public String getFirst_contact_phone() {
    return first_contact_phone;
  }

  public void setFirst_contact_phone(String first_contact_phone) {
    this.first_contact_phone = first_contact_phone;
  }

  public Long getFrist_contact_relation() {
    return frist_contact_relation;
  }

  public void setFrist_contact_relation(Long frist_contact_relation) {
    this.frist_contact_relation = frist_contact_relation;
  }

  public String getSecond_contact_name() {
    return second_contact_name;
  }

  public void setSecond_contact_name(String second_contact_name) {
    this.second_contact_name = second_contact_name;
  }

  public String getSecond_contact_phone() {
    return second_contact_phone;
  }

  public void setSecond_contact_phone(String second_contact_phone) {
    this.second_contact_phone = second_contact_phone;
  }

  public Long getSecond_contact_relation() {
    return second_contact_relation;
  }

  public void setSecond_contact_relation(Long second_contact_relation) {
    this.second_contact_relation = second_contact_relation;
  }

  public java.sql.Timestamp getCreate_time() {
    return create_time;
  }

  public void setCreate_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }

  public String getCreate_ip() {
    return create_ip;
  }

  public void setCreate_ip(String create_ip) {
    this.create_ip = create_ip;
  }

  public java.sql.Timestamp getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public Long getInvite_userid() {
    return invite_userid;
  }

  public void setInvite_userid(Long invite_userid) {
    this.invite_userid = invite_userid;
  }

  public Long getIs_save() {
    return is_save;
  }

  public void setIs_save(Long is_save) {
    this.is_save = is_save;
  }

  public String getHead_portrait() {
    return head_portrait;
  }

  public void setHead_portrait(String head_portrait) {
    this.head_portrait = head_portrait;
  }

  public String getIdcard_img_z() {
    return idcard_img_z;
  }

  public void setIdcard_img_z(String idcard_img_z) {
    this.idcard_img_z = idcard_img_z;
  }

  public String getIdcard_img_f() {
    return idcard_img_f;
  }

  public void setIdcard_img_f(String idcard_img_f) {
    this.idcard_img_f = idcard_img_f;
  }

  public Long getCustomer_type() {
    return customer_type;
  }

  public void setCustomer_type(Long customer_type) {
    this.customer_type = customer_type;
  }

  public Long getAmount_min() {
    return amount_min;
  }

  public void setAmount_min(Long amount_min) {
    this.amount_min = amount_min;
  }

  public Long getAmount_max() {
    return amount_max;
  }

  public void setAmount_max(Long amount_max) {
    this.amount_max = amount_max;
  }

  public Long getAmount_available() {
    return amount_available;
  }

  public void setAmount_available(Long amount_available) {
    this.amount_available = amount_available;
  }

  public Long getAmount_addsum() {
    return amount_addsum;
  }

  public void setAmount_addsum(Long amount_addsum) {
    this.amount_addsum = amount_addsum;
  }

  public java.sql.Timestamp getJs_amount_time() {
    return js_amount_time;
  }

  public void setJs_amount_time(java.sql.Timestamp js_amount_time) {
    this.js_amount_time = js_amount_time;
  }

  public String getEquipment_number() {
    return equipment_number;
  }

  public void setEquipment_number(String equipment_number) {
    this.equipment_number = equipment_number;
  }

  public Double getZm_score() {
    return zm_score;
  }

  public void setZm_score(Double zm_score) {
    this.zm_score = zm_score;
  }

  public java.sql.Timestamp getZm_score_time() {
    return zm_score_time;
  }

  public void setZm_score_time(java.sql.Timestamp zm_score_time) {
    this.zm_score_time = zm_score_time;
  }

  public Long getZm_industy_black() {
    return zm_industy_black;
  }

  public void setZm_industy_black(Long zm_industy_black) {
    this.zm_industy_black = zm_industy_black;
  }

  public Long getZm_over() {
    return zm_over;
  }

  public void setZm_over(Long zm_over) {
    this.zm_over = zm_over;
  }

  public Long getZm_no_pay_over() {
    return zm_no_pay_over;
  }

  public void setZm_no_pay_over(Long zm_no_pay_over) {
    this.zm_no_pay_over = zm_no_pay_over;
  }

  public java.sql.Timestamp getZm_industy_time() {
    return zm_industy_time;
  }

  public void setZm_industy_time(java.sql.Timestamp zm_industy_time) {
    this.zm_industy_time = zm_industy_time;
  }

  public Long getZm_status() {
    return zm_status;
  }

  public void setZm_status(Long zm_status) {
    this.zm_status = zm_status;
  }

  public Double getMy_hb() {
    return my_hb;
  }

  public void setMy_hb(Double my_hb) {
    this.my_hb = my_hb;
  }

  public java.sql.Timestamp getMy_hb_time() {
    return my_hb_time;
  }

  public void setMy_hb_time(java.sql.Timestamp my_hb_time) {
    this.my_hb_time = my_hb_time;
  }

  public String getJxl_token() {
    return jxl_token;
  }

  public void setJxl_token(String jxl_token) {
    this.jxl_token = jxl_token;
  }

  public java.sql.Timestamp getJxl_token_time() {
    return jxl_token_time;
  }

  public void setJxl_token_time(java.sql.Timestamp jxl_token_time) {
    this.jxl_token_time = jxl_token_time;
  }

  public Long getJxl_status() {
    return jxl_status;
  }

  public void setJxl_status(Long jxl_status) {
    this.jxl_status = jxl_status;
  }

  public String getJxl_detail() {
    return jxl_detail;
  }

  public void setJxl_detail(String jxl_detail) {
    this.jxl_detail = jxl_detail;
  }

  public java.sql.Timestamp getJxl_detail_time() {
    return jxl_detail_time;
  }

  public void setJxl_detail_time(java.sql.Timestamp jxl_detail_time) {
    this.jxl_detail_time = jxl_detail_time;
  }

  public Long getJxl_detail_status() {
    return jxl_detail_status;
  }

  public void setJxl_detail_status(Long jxl_detail_status) {
    this.jxl_detail_status = jxl_detail_status;
  }

  public Long getJxl_zj_dk_num() {
    return jxl_zj_dk_num;
  }

  public void setJxl_zj_dk_num(Long jxl_zj_dk_num) {
    this.jxl_zj_dk_num = jxl_zj_dk_num;
  }

  public Long getJxl_bj_dk_num() {
    return jxl_bj_dk_num;
  }

  public void setJxl_bj_dk_num(Long jxl_bj_dk_num) {
    this.jxl_bj_dk_num = jxl_bj_dk_num;
  }

  public Double getJxl_yj_hf() {
    return jxl_yj_hf;
  }

  public void setJxl_yj_hf(Double jxl_yj_hf) {
    this.jxl_yj_hf = jxl_yj_hf;
  }

  public Long getJxl_link2_days() {
    return jxl_link2_days;
  }

  public void setJxl_link2_days(Long jxl_link2_days) {
    this.jxl_link2_days = jxl_link2_days;
  }

  public Long getJxl_link1_days() {
    return jxl_link1_days;
  }

  public void setJxl_link1_days(Long jxl_link1_days) {
    this.jxl_link1_days = jxl_link1_days;
  }

  public Long getJxl_link2_num() {
    return jxl_link2_num;
  }

  public void setJxl_link2_num(Long jxl_link2_num) {
    this.jxl_link2_num = jxl_link2_num;
  }

  public Long getJxl_link1_num() {
    return jxl_link1_num;
  }

  public void setJxl_link1_num(Long jxl_link1_num) {
    this.jxl_link1_num = jxl_link1_num;
  }

  public Long getJxl_link2_order() {
    return jxl_link2_order;
  }

  public void setJxl_link2_order(Long jxl_link2_order) {
    this.jxl_link2_order = jxl_link2_order;
  }

  public Long getJxl_link1_order() {
    return jxl_link1_order;
  }

  public void setJxl_link1_order(Long jxl_link1_order) {
    this.jxl_link1_order = jxl_link1_order;
  }

  public Long getJxl_gj_ts() {
    return jxl_gj_ts;
  }

  public void setJxl_gj_ts(Long jxl_gj_ts) {
    this.jxl_gj_ts = jxl_gj_ts;
  }

  public Long getJxl_total() {
    return jxl_total;
  }

  public void setJxl_total(Long jxl_total) {
    this.jxl_total = jxl_total;
  }

  public Double getJxl_gj_bl() {
    return jxl_gj_bl;
  }

  public void setJxl_gj_bl(Double jxl_gj_bl) {
    this.jxl_gj_bl = jxl_gj_bl;
  }

  public Long getJxl_lx_gj_ts() {
    return jxl_lx_gj_ts;
  }

  public void setJxl_lx_gj_ts(Long jxl_lx_gj_ts) {
    this.jxl_lx_gj_ts = jxl_lx_gj_ts;
  }

  public Long getJxl_ht_phone_num() {
    return jxl_ht_phone_num;
  }

  public void setJxl_ht_phone_num(Long jxl_ht_phone_num) {
    this.jxl_ht_phone_num = jxl_ht_phone_num;
  }

  public Long getJxl_amth_num() {
    return jxl_amth_num;
  }

  public void setJxl_amth_num(Long jxl_amth_num) {
    this.jxl_amth_num = jxl_amth_num;
  }

  public Long getJxl_phone_reg_days() {
    return jxl_phone_reg_days;
  }

  public void setJxl_phone_reg_days(Long jxl_phone_reg_days) {
    this.jxl_phone_reg_days = jxl_phone_reg_days;
  }

  public java.sql.Timestamp getJxl_time() {
    return jxl_time;
  }

  public void setJxl_time(java.sql.Timestamp jxl_time) {
    this.jxl_time = jxl_time;
  }

  public Long getJxl_realname() {
    return jxl_realname;
  }

  public void setJxl_realname(Long jxl_realname) {
    this.jxl_realname = jxl_realname;
  }

  public Long getGo_am_num() {
    return go_am_num;
  }

  public void setGo_am_num(Long go_am_num) {
    this.go_am_num = go_am_num;
  }

  public Long getJxl_same_phone_card() {
    return jxl_same_phone_card;
  }

  public void setJxl_same_phone_card(Long jxl_same_phone_card) {
    this.jxl_same_phone_card = jxl_same_phone_card;
  }

  public Long getZjlxr_black() {
    return zjlxr_black;
  }

  public void setZjlxr_black(Long zjlxr_black) {
    this.zjlxr_black = zjlxr_black;
  }

  public Long getJjlxr_black() {
    return jjlxr_black;
  }

  public void setJjlxr_black(Long jjlxr_black) {
    this.jjlxr_black = jjlxr_black;
  }

  public Long getYqjj_black() {
    return yqjj_black;
  }

  public void setYqjj_black(Long yqjj_black) {
    this.yqjj_black = yqjj_black;
  }

  public Long getUser_contact_size() {
    return user_contact_size;
  }

  public void setUser_contact_size(Long user_contact_size) {
    this.user_contact_size = user_contact_size;
  }

  public Long getHistory_over_num() {
    return history_over_num;
  }

  public void setHistory_over_num(Long history_over_num) {
    this.history_over_num = history_over_num;
  }

  public Long getLast_over_days() {
    return last_over_days;
  }

  public void setLast_over_days(Long last_over_days) {
    this.last_over_days = last_over_days;
  }

  public Long getCsjy() {
    return csjy;
  }

  public void setCsjy(Long csjy) {
    this.csjy = csjy;
  }

  public String getUser_from() {
    return user_from;
  }

  public void setUser_from(String user_from) {
    this.user_from = user_from;
  }

  public Long getNew_flag() {
    return new_flag;
  }

  public void setNew_flag(Long new_flag) {
    this.new_flag = new_flag;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getTg() {
    return tg;
  }

  public void setTg(String tg) {
    this.tg = tg;
  }

  public String getTg_flag() {
    return tg_flag;
  }

  public void setTg_flag(String tg_flag) {
    this.tg_flag = tg_flag;
  }

  @Override
  protected Serializable pkVal() {
    return this.id;
  }
}
