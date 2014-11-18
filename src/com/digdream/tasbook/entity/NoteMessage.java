package com.digdream.tasbook.entity;

public class NoteMessage {
	private String icon_id;
	private String title;
	private String msg;
	private String time;
	private String tag;
	private String shareauthor;
	private int commentCount;
	
	/*
	 * TextView tv_book_share_time;
    	TextView tv_share_author;
    	TextView tv_book_summary;
    	TextView tv_book_title;
    	TextView tv_book_tag;
    	
    	
       
        ImageView iv_bookimage;
        ImageView iv_head_icon;
        ImageView iv_comment;
        ImageView iv_more;
        ImageView iv_like;
	 */
	
	public NoteMessage(){
		
	}
	public NoteMessage(String title, String msg, String time,int commentCount) {
		this.title = title;
		this.msg = msg;
		this.time = time;
		this.commentCount = commentCount;
	}
	
	public void setTag(String tag){
		this.tag = tag;
	}
	public String getTag(){
		return tag;
	}
	public void setShareAuthor(String author){
		this.shareauthor = author;
	}
	public String getShareAuthor(){
		return shareauthor;
	}
	public String getIcon_id() {
		return icon_id;
	}
	public void setIcon_id(String icon_id) {
		this.icon_id = icon_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCommentCount() {
		return commentCount;
	}
	
}