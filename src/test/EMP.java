package test;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Fadeev on 07.04.2016.
 */


@Entity
@Table(name = "EMP")
public class EMP {

    @Id
    @Column(name = "EMPNO")
    private int empNo;
    @Column(name= "ENAME")
    private String ename;
    @Column(name= "JOB")
    private String job;
    @Column(name= "MGR")
    private Integer mgr;
    @Column(name= "HIREDATE")
    @Temporal(value=TemporalType.DATE)
    private Date hireDate;
    @Column(name= "SAL")
    private int sal;
    @Column(name= "COMM")
    private Integer comm;
    @Column(name= "DEPTNO")
    private int deptno;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }


}
