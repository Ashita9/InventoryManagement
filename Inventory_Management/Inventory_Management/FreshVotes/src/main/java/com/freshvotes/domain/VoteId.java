package com.freshvotes.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable
{
  private static final long serialVersionUID = 6202269445639364170L;
  private User user;
  private Inventory feature;
  
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
  public Inventory getFeature()
  {
    return feature;
  }
  public void setFeature(Inventory feature)
  {
    this.feature = feature;
  }
}
