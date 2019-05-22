package cn.edu.entity;

public class course {
    private int cid;
    private String cname;
    private int credit;
    private int score;
    public course() {
    }

    @Override
    public String toString() {
        return "course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", credit=" + credit +
                ", score=" + score +
                '}';
    }

    public course(int cid, String cname, int credit, int score) {
        this.cid = cid;
        this.cname = cname;
        this.credit=credit;
        this.score=score;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String  cname) {
        this.cname = cname;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
