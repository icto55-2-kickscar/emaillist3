package com.sds.icto.emaillist.exception;

public class UserDeleteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UserDeleteException() {
		super( "Delete User Exception" );
	}
	
	public UserDeleteException( String msg ) {
		super( msg );
	}
	
}
