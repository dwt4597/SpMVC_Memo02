package com.biz.memo02.dao;

public class MemoSQL {

	public static final String MEMO_SELECT_ALL
	=" select * from tbl_memo ";
	
	public static final String MEMO_FIND_BY_ID
	=" select * from tbl_memo where id = #{id} ";
	
	public static final String MEMO_INSERT
	=" insert into tbl_memo ";
	
	public static final String MEMO_UPDATE
	=" update ";
	
	public static final String MEMO_DELETE
	=" delete from tbl_memo where id=#{id} ";
	
}
