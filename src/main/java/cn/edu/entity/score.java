package cn.edu.entity;

public class score {
    private int cid;
    private int sid;
    private double score;
    private int id;

    public score() {
    }

    public score(int cid, int sid, double score, int id) {
        this.cid = cid;
        this.sid = sid;
        this.score = score;
        this.id = id;
    }

    @Override
    public String toString() {
        return "score{" +
                "cid=" + cid +
                ", sid=" + sid +
                ", score=" + score +
                ", id=" + id +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
