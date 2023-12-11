package com.freshvotes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory
{
  private Long id;
  private String title;
  private String description;
  private String count;
   
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  public Long getId()
  {
    return id;
  }
  public void setId(Long id)
  {
    this.id = id;
  }
  public String getTitle()
  {
    return title;
  }
  public void setTitle(String title)
  {
    this.title = title;
  }
  public String getDescription()
  {
    return description;
  }
  public void setDescription(String description)
  {
    this.description = description;
  }
  public String getStatus()
  {
    return count;
  }
  public void setStatus(String count)
  {
    this.count = count;
  }
}
