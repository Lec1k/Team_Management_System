package domain;

import javax.persistence.*;

/**
 * Created by Lecik on 22.08.2016.
 */
@Entity
@Table(name = "DEPTNT")
public class Department {

    @Id
    @Column(name = "DEPTNO")
    @GeneratedValue(generator = "deptno_seq")
    @SequenceGenerator( name = "deptno_seq", sequenceName = "DEPTNT_id_seq")
    private Integer deptno;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOC")
    private String loc;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
