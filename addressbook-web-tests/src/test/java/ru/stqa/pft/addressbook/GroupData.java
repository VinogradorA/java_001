package ru.stqa.pft.addressbook;

public class GroupData {
  private final String name;
  private final String header;
  private final String foother;

  public GroupData(String name, String header, String footer) {
    this.name = name;
    this.header = header;
    this.foother = footer;
  }

  public String getName() {
    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return foother;
  }
}
