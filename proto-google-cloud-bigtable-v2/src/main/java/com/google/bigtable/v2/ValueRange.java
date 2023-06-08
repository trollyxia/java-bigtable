/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

/**
 *
 *
 * <pre>
 * Specifies a contiguous range of raw byte values.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.ValueRange}
 */
public final class ValueRange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.ValueRange)
    ValueRangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ValueRange.newBuilder() to construct.
  private ValueRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValueRange() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValueRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.v2.DataProto
        .internal_static_google_bigtable_v2_ValueRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.DataProto
        .internal_static_google_bigtable_v2_ValueRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.ValueRange.class,
            com.google.bigtable.v2.ValueRange.Builder.class);
  }

  private int startValueCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object startValue_;

  public enum StartValueCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    START_VALUE_CLOSED(1),
    START_VALUE_OPEN(2),
    STARTVALUE_NOT_SET(0);
    private final int value;

    private StartValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StartValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static StartValueCase forNumber(int value) {
      switch (value) {
        case 1:
          return START_VALUE_CLOSED;
        case 2:
          return START_VALUE_OPEN;
        case 0:
          return STARTVALUE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public StartValueCase getStartValueCase() {
    return StartValueCase.forNumber(startValueCase_);
  }

  private int endValueCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object endValue_;

  public enum EndValueCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    END_VALUE_CLOSED(3),
    END_VALUE_OPEN(4),
    ENDVALUE_NOT_SET(0);
    private final int value;

    private EndValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EndValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static EndValueCase forNumber(int value) {
      switch (value) {
        case 3:
          return END_VALUE_CLOSED;
        case 4:
          return END_VALUE_OPEN;
        case 0:
          return ENDVALUE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public EndValueCase getEndValueCase() {
    return EndValueCase.forNumber(endValueCase_);
  }

  public static final int START_VALUE_CLOSED_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_value_closed = 1;</code>
   *
   * @return Whether the startValueClosed field is set.
   */
  @java.lang.Override
  public boolean hasStartValueClosed() {
    return startValueCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_value_closed = 1;</code>
   *
   * @return The startValueClosed.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStartValueClosed() {
    if (startValueCase_ == 1) {
      return (com.google.protobuf.ByteString) startValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int START_VALUE_OPEN_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_value_open = 2;</code>
   *
   * @return Whether the startValueOpen field is set.
   */
  @java.lang.Override
  public boolean hasStartValueOpen() {
    return startValueCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_value_open = 2;</code>
   *
   * @return The startValueOpen.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStartValueOpen() {
    if (startValueCase_ == 2) {
      return (com.google.protobuf.ByteString) startValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int END_VALUE_CLOSED_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_value_closed = 3;</code>
   *
   * @return Whether the endValueClosed field is set.
   */
  @java.lang.Override
  public boolean hasEndValueClosed() {
    return endValueCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_value_closed = 3;</code>
   *
   * @return The endValueClosed.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEndValueClosed() {
    if (endValueCase_ == 3) {
      return (com.google.protobuf.ByteString) endValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int END_VALUE_OPEN_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_value_open = 4;</code>
   *
   * @return Whether the endValueOpen field is set.
   */
  @java.lang.Override
  public boolean hasEndValueOpen() {
    return endValueCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_value_open = 4;</code>
   *
   * @return The endValueOpen.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEndValueOpen() {
    if (endValueCase_ == 4) {
      return (com.google.protobuf.ByteString) endValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (startValueCase_ == 1) {
      output.writeBytes(1, (com.google.protobuf.ByteString) startValue_);
    }
    if (startValueCase_ == 2) {
      output.writeBytes(2, (com.google.protobuf.ByteString) startValue_);
    }
    if (endValueCase_ == 3) {
      output.writeBytes(3, (com.google.protobuf.ByteString) endValue_);
    }
    if (endValueCase_ == 4) {
      output.writeBytes(4, (com.google.protobuf.ByteString) endValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startValueCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              1, (com.google.protobuf.ByteString) startValue_);
    }
    if (startValueCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              2, (com.google.protobuf.ByteString) startValue_);
    }
    if (endValueCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              3, (com.google.protobuf.ByteString) endValue_);
    }
    if (endValueCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              4, (com.google.protobuf.ByteString) endValue_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.bigtable.v2.ValueRange)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.ValueRange other = (com.google.bigtable.v2.ValueRange) obj;

    if (!getStartValueCase().equals(other.getStartValueCase())) return false;
    switch (startValueCase_) {
      case 1:
        if (!getStartValueClosed().equals(other.getStartValueClosed())) return false;
        break;
      case 2:
        if (!getStartValueOpen().equals(other.getStartValueOpen())) return false;
        break;
      case 0:
      default:
    }
    if (!getEndValueCase().equals(other.getEndValueCase())) return false;
    switch (endValueCase_) {
      case 3:
        if (!getEndValueClosed().equals(other.getEndValueClosed())) return false;
        break;
      case 4:
        if (!getEndValueOpen().equals(other.getEndValueOpen())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (startValueCase_) {
      case 1:
        hash = (37 * hash) + START_VALUE_CLOSED_FIELD_NUMBER;
        hash = (53 * hash) + getStartValueClosed().hashCode();
        break;
      case 2:
        hash = (37 * hash) + START_VALUE_OPEN_FIELD_NUMBER;
        hash = (53 * hash) + getStartValueOpen().hashCode();
        break;
      case 0:
      default:
    }
    switch (endValueCase_) {
      case 3:
        hash = (37 * hash) + END_VALUE_CLOSED_FIELD_NUMBER;
        hash = (53 * hash) + getEndValueClosed().hashCode();
        break;
      case 4:
        hash = (37 * hash) + END_VALUE_OPEN_FIELD_NUMBER;
        hash = (53 * hash) + getEndValueOpen().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.ValueRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ValueRange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ValueRange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.bigtable.v2.ValueRange prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Specifies a contiguous range of raw byte values.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.ValueRange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.ValueRange)
      com.google.bigtable.v2.ValueRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.v2.DataProto
          .internal_static_google_bigtable_v2_ValueRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.DataProto
          .internal_static_google_bigtable_v2_ValueRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.ValueRange.class,
              com.google.bigtable.v2.ValueRange.Builder.class);
    }

    // Construct using com.google.bigtable.v2.ValueRange.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      startValueCase_ = 0;
      startValue_ = null;
      endValueCase_ = 0;
      endValue_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.v2.DataProto
          .internal_static_google_bigtable_v2_ValueRange_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.ValueRange getDefaultInstanceForType() {
      return com.google.bigtable.v2.ValueRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.ValueRange build() {
      com.google.bigtable.v2.ValueRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.ValueRange buildPartial() {
      com.google.bigtable.v2.ValueRange result = new com.google.bigtable.v2.ValueRange(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.bigtable.v2.ValueRange result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.bigtable.v2.ValueRange result) {
      result.startValueCase_ = startValueCase_;
      result.startValue_ = this.startValue_;
      result.endValueCase_ = endValueCase_;
      result.endValue_ = this.endValue_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v2.ValueRange) {
        return mergeFrom((com.google.bigtable.v2.ValueRange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.ValueRange other) {
      if (other == com.google.bigtable.v2.ValueRange.getDefaultInstance()) return this;
      switch (other.getStartValueCase()) {
        case START_VALUE_CLOSED:
          {
            setStartValueClosed(other.getStartValueClosed());
            break;
          }
        case START_VALUE_OPEN:
          {
            setStartValueOpen(other.getStartValueOpen());
            break;
          }
        case STARTVALUE_NOT_SET:
          {
            break;
          }
      }
      switch (other.getEndValueCase()) {
        case END_VALUE_CLOSED:
          {
            setEndValueClosed(other.getEndValueClosed());
            break;
          }
        case END_VALUE_OPEN:
          {
            setEndValueOpen(other.getEndValueOpen());
            break;
          }
        case ENDVALUE_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                startValue_ = input.readBytes();
                startValueCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                startValue_ = input.readBytes();
                startValueCase_ = 2;
                break;
              } // case 18
            case 26:
              {
                endValue_ = input.readBytes();
                endValueCase_ = 3;
                break;
              } // case 26
            case 34:
              {
                endValue_ = input.readBytes();
                endValueCase_ = 4;
                break;
              } // case 34
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int startValueCase_ = 0;
    private java.lang.Object startValue_;

    public StartValueCase getStartValueCase() {
      return StartValueCase.forNumber(startValueCase_);
    }

    public Builder clearStartValue() {
      startValueCase_ = 0;
      startValue_ = null;
      onChanged();
      return this;
    }

    private int endValueCase_ = 0;
    private java.lang.Object endValue_;

    public EndValueCase getEndValueCase() {
      return EndValueCase.forNumber(endValueCase_);
    }

    public Builder clearEndValue() {
      endValueCase_ = 0;
      endValue_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_closed = 1;</code>
     *
     * @return Whether the startValueClosed field is set.
     */
    public boolean hasStartValueClosed() {
      return startValueCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_closed = 1;</code>
     *
     * @return The startValueClosed.
     */
    public com.google.protobuf.ByteString getStartValueClosed() {
      if (startValueCase_ == 1) {
        return (com.google.protobuf.ByteString) startValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_closed = 1;</code>
     *
     * @param value The startValueClosed to set.
     * @return This builder for chaining.
     */
    public Builder setStartValueClosed(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      startValueCase_ = 1;
      startValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_closed = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStartValueClosed() {
      if (startValueCase_ == 1) {
        startValueCase_ = 0;
        startValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_open = 2;</code>
     *
     * @return Whether the startValueOpen field is set.
     */
    public boolean hasStartValueOpen() {
      return startValueCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_open = 2;</code>
     *
     * @return The startValueOpen.
     */
    public com.google.protobuf.ByteString getStartValueOpen() {
      if (startValueCase_ == 2) {
        return (com.google.protobuf.ByteString) startValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_open = 2;</code>
     *
     * @param value The startValueOpen to set.
     * @return This builder for chaining.
     */
    public Builder setStartValueOpen(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      startValueCase_ = 2;
      startValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_open = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStartValueOpen() {
      if (startValueCase_ == 2) {
        startValueCase_ = 0;
        startValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_closed = 3;</code>
     *
     * @return Whether the endValueClosed field is set.
     */
    public boolean hasEndValueClosed() {
      return endValueCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_closed = 3;</code>
     *
     * @return The endValueClosed.
     */
    public com.google.protobuf.ByteString getEndValueClosed() {
      if (endValueCase_ == 3) {
        return (com.google.protobuf.ByteString) endValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_closed = 3;</code>
     *
     * @param value The endValueClosed to set.
     * @return This builder for chaining.
     */
    public Builder setEndValueClosed(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      endValueCase_ = 3;
      endValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_closed = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEndValueClosed() {
      if (endValueCase_ == 3) {
        endValueCase_ = 0;
        endValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_open = 4;</code>
     *
     * @return Whether the endValueOpen field is set.
     */
    public boolean hasEndValueOpen() {
      return endValueCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_open = 4;</code>
     *
     * @return The endValueOpen.
     */
    public com.google.protobuf.ByteString getEndValueOpen() {
      if (endValueCase_ == 4) {
        return (com.google.protobuf.ByteString) endValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_open = 4;</code>
     *
     * @param value The endValueOpen to set.
     * @return This builder for chaining.
     */
    public Builder setEndValueOpen(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      endValueCase_ = 4;
      endValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_open = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEndValueOpen() {
      if (endValueCase_ == 4) {
        endValueCase_ = 0;
        endValue_ = null;
        onChanged();
      }
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.ValueRange)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.ValueRange)
  private static final com.google.bigtable.v2.ValueRange DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.ValueRange();
  }

  public static com.google.bigtable.v2.ValueRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValueRange> PARSER =
      new com.google.protobuf.AbstractParser<ValueRange>() {
        @java.lang.Override
        public ValueRange parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ValueRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValueRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.ValueRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
