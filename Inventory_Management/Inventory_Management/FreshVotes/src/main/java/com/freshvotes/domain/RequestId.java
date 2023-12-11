package com.freshvotes.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class RequestId implements Serializable
{
  private static final long serialVersionUID = -3690211290276882371L;
  private User user;
  private Inventory inventory;
  
  @ManyToOne
  public User getUser()
  {
    return user;
  }
  public void setUser(User user)
  {
    this.user = user;
  }
  @ManyToOne
  public Inventory getInventory()
  {
    return inventory;
  }
  public void setInventory(Inventory inventory)
  {
    this.inventory = inventory;
  }
}
