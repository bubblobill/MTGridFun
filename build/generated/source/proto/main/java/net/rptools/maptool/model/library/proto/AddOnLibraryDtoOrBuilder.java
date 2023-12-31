// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library.proto

package net.rptools.maptool.model.library.proto;

public interface AddOnLibraryDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.AddOnLibraryDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 17;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 17;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string version = 18;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 18;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string website = 19;</code>
   * @return The website.
   */
  java.lang.String getWebsite();
  /**
   * <code>string website = 19;</code>
   * @return The bytes for website.
   */
  com.google.protobuf.ByteString
      getWebsiteBytes();

  /**
   * <code>string git_url = 20;</code>
   * @return The gitUrl.
   */
  java.lang.String getGitUrl();
  /**
   * <code>string git_url = 20;</code>
   * @return The bytes for gitUrl.
   */
  com.google.protobuf.ByteString
      getGitUrlBytes();

  /**
   * <code>repeated string authors = 21;</code>
   * @return A list containing the authors.
   */
  java.util.List<java.lang.String>
      getAuthorsList();
  /**
   * <code>repeated string authors = 21;</code>
   * @return The count of authors.
   */
  int getAuthorsCount();
  /**
   * <code>repeated string authors = 21;</code>
   * @param index The index of the element to return.
   * @return The authors at the given index.
   */
  java.lang.String getAuthors(int index);
  /**
   * <code>repeated string authors = 21;</code>
   * @param index The index of the value to return.
   * @return The bytes of the authors at the given index.
   */
  com.google.protobuf.ByteString
      getAuthorsBytes(int index);

  /**
   * <code>string license = 22;</code>
   * @return The license.
   */
  java.lang.String getLicense();
  /**
   * <code>string license = 22;</code>
   * @return The bytes for license.
   */
  com.google.protobuf.ByteString
      getLicenseBytes();

  /**
   * <code>string namespace = 23;</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <code>string namespace = 23;</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <code>string description = 24;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 24;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string short_description = 25;</code>
   * @return The shortDescription.
   */
  java.lang.String getShortDescription();
  /**
   * <code>string short_description = 25;</code>
   * @return The bytes for shortDescription.
   */
  com.google.protobuf.ByteString
      getShortDescriptionBytes();

  /**
   * <code>bool allowsUriAccess = 26;</code>
   * @return The allowsUriAccess.
   */
  boolean getAllowsUriAccess();

  /**
   * <code>string license_file = 27;</code>
   * @return The licenseFile.
   */
  java.lang.String getLicenseFile();
  /**
   * <code>string license_file = 27;</code>
   * @return The bytes for licenseFile.
   */
  com.google.protobuf.ByteString
      getLicenseFileBytes();

  /**
   * <code>string read_me_file = 28;</code>
   * @return The readMeFile.
   */
  java.lang.String getReadMeFile();
  /**
   * <code>string read_me_file = 28;</code>
   * @return The bytes for readMeFile.
   */
  com.google.protobuf.ByteString
      getReadMeFileBytes();
}
