package online.qsx.model;

import java.io.Serializable;
import java.util.Date;

public class StudentModel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.StudentNo
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private Integer studentno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.LoginPwd
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private String loginpwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.StudentName
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private String studentname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Sex
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private Boolean sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.GradeId
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private Integer gradeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Phone
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Address
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.BornDate
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private Date borndate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.Email
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.IdentityCard
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private String identitycard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.StudentNo
     *
     * @return the value of student.StudentNo
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public Integer getStudentno() {
        return studentno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.StudentNo
     *
     * @param studentno the value for student.StudentNo
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setStudentno(Integer studentno) {
        this.studentno = studentno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.LoginPwd
     *
     * @return the value of student.LoginPwd
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public String getLoginpwd() {
        return loginpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.LoginPwd
     *
     * @param loginpwd the value for student.LoginPwd
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.StudentName
     *
     * @return the value of student.StudentName
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public String getStudentname() {
        return studentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.StudentName
     *
     * @param studentname the value for student.StudentName
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Sex
     *
     * @return the value of student.Sex
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Sex
     *
     * @param sex the value for student.Sex
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.GradeId
     *
     * @return the value of student.GradeId
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public Integer getGradeid() {
        return gradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.GradeId
     *
     * @param gradeid the value for student.GradeId
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Phone
     *
     * @return the value of student.Phone
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Phone
     *
     * @param phone the value for student.Phone
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Address
     *
     * @return the value of student.Address
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Address
     *
     * @param address the value for student.Address
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.BornDate
     *
     * @return the value of student.BornDate
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public Date getBorndate() {
        return borndate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.BornDate
     *
     * @param borndate the value for student.BornDate
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.Email
     *
     * @return the value of student.Email
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.Email
     *
     * @param email the value for student.Email
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.IdentityCard
     *
     * @return the value of student.IdentityCard
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public String getIdentitycard() {
        return identitycard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.IdentityCard
     *
     * @param identitycard the value for student.IdentityCard
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard == null ? null : identitycard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Nov 22 14:57:06 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentno=").append(studentno);
        sb.append(", loginpwd=").append(loginpwd);
        sb.append(", studentname=").append(studentname);
        sb.append(", sex=").append(sex);
        sb.append(", gradeid=").append(gradeid);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", borndate=").append(borndate);
        sb.append(", email=").append(email);
        sb.append(", identitycard=").append(identitycard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}