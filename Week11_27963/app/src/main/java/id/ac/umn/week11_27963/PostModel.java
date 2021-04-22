package id.ac.umn.week11_27963;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class PostModel {
    @SerializedName("userId")
    @Expose
    private Integer userId;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("body")
    @Expose
    private String body;

    public Integer getUserId() { return userId; }

    public void setUserId(Integer userId) { this.userId = userId; }

    public Integer getId() { return id; }

    public void setId() { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle() { this.title = title; }

    public String getBody() { return body; }

    public void setBody() { this.body = body; }
}
