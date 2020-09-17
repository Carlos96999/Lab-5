package edu.eci.cvds.servlet.model;

public class Todo {
	private int userId=0;
	private int id=0;
	private String title;
	private boolean completed;
	
	/**
	 *Este metodo entrega el Id del usuario
	 */
	public int getUserId()
	{
		return userId;
	}
	/**
	 *Este metodo entrega el Id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 *Este metodo entrega el titulo
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 *Este metodo entrega si se completo el procedimiento
	 */
	public boolean getCompleted()
	{
		return completed;
	}
	/**
	 *Este metodo asigna un Id a un usuario
	 *@param
	 *user_Id=int
	 */
	public void setIduser(int user_Id)
	{
		userId=user_Id;
	}
	/**
	 *Este metodo asigna un Id
	 *@param
	 *set_Id=int
	 */
	public void setId(int set_Id)
	{
		id=set_Id;
	}
	/**
	 *Este metodo asigna un titulo
	 *@param
	 *title=string
	 */
	public void setTitle(String titleText)
	{
		title=titleText;
	}
	/**
	 *Este metodo asigna true o false, si se completo o no
	 *@param
	 *Setcompleted=boolean
	 */
	public void setCompleted(boolean Setcompleted)
	{
		completed=Setcompleted;
	}
}
