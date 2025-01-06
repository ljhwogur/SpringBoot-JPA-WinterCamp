package org.syu;

public class BulletinVO {

    private String name;
    private String userid;
    private String content;

    public String getName() {
        return this.name;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getContent() {
        return this.content;
    }

    public BulletinVO(String userid, String name, String content) {
        this.userid = userid;
        this.name = name;
        this.content = content;
    }
}
