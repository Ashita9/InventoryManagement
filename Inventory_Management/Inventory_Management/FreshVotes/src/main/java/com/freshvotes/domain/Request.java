package com.freshvotes.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Request
{
  private RequestId pk;
  private String text;
  private String status;
  
  public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@EmbeddedId
  public RequestId getPk()
  {
    return pk;
  }
  public void setPk(RequestId pk)
  {
    this.pk = pk;
  }
  @Column(length=5000)
  public String getText()
  {
    return text;
  }
  public void setText(String text)
  {
    this.text = text;
  }
}
