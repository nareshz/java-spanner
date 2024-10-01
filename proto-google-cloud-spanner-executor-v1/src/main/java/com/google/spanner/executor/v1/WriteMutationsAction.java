/*
 * Copyright 2024 Google LLC
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
// source: google/spanner/executor/v1/cloud_executor.proto

// Protobuf Java Version: 3.25.5
package com.google.spanner.executor.v1;

/**
 *
 *
 * <pre>
 * WriteMutationAction defines an action of flushing the mutation so they
 * are visible to subsequent operations in the transaction.
 * </pre>
 *
 * Protobuf type {@code google.spanner.executor.v1.WriteMutationsAction}
 */
public final class WriteMutationsAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.executor.v1.WriteMutationsAction)
    WriteMutationsActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WriteMutationsAction.newBuilder() to construct.
  private WriteMutationsAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WriteMutationsAction() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WriteMutationsAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.executor.v1.CloudExecutorProto
        .internal_static_google_spanner_executor_v1_WriteMutationsAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.executor.v1.CloudExecutorProto
        .internal_static_google_spanner_executor_v1_WriteMutationsAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.executor.v1.WriteMutationsAction.class,
            com.google.spanner.executor.v1.WriteMutationsAction.Builder.class);
  }

  private int bitField0_;
  public static final int MUTATION_FIELD_NUMBER = 1;
  private com.google.spanner.executor.v1.MutationAction mutation_;
  /**
   *
   *
   * <pre>
   * The mutation to write.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
   *
   * @return Whether the mutation field is set.
   */
  @java.lang.Override
  public boolean hasMutation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The mutation to write.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
   *
   * @return The mutation.
   */
  @java.lang.Override
  public com.google.spanner.executor.v1.MutationAction getMutation() {
    return mutation_ == null
        ? com.google.spanner.executor.v1.MutationAction.getDefaultInstance()
        : mutation_;
  }
  /**
   *
   *
   * <pre>
   * The mutation to write.
   * </pre>
   *
   * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.executor.v1.MutationActionOrBuilder getMutationOrBuilder() {
    return mutation_ == null
        ? com.google.spanner.executor.v1.MutationAction.getDefaultInstance()
        : mutation_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getMutation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMutation());
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
    if (!(obj instanceof com.google.spanner.executor.v1.WriteMutationsAction)) {
      return super.equals(obj);
    }
    com.google.spanner.executor.v1.WriteMutationsAction other =
        (com.google.spanner.executor.v1.WriteMutationsAction) obj;

    if (hasMutation() != other.hasMutation()) return false;
    if (hasMutation()) {
      if (!getMutation().equals(other.getMutation())) return false;
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
    if (hasMutation()) {
      hash = (37 * hash) + MUTATION_FIELD_NUMBER;
      hash = (53 * hash) + getMutation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction parseFrom(
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

  public static Builder newBuilder(com.google.spanner.executor.v1.WriteMutationsAction prototype) {
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
   * WriteMutationAction defines an action of flushing the mutation so they
   * are visible to subsequent operations in the transaction.
   * </pre>
   *
   * Protobuf type {@code google.spanner.executor.v1.WriteMutationsAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.executor.v1.WriteMutationsAction)
      com.google.spanner.executor.v1.WriteMutationsActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_WriteMutationsAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_WriteMutationsAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.executor.v1.WriteMutationsAction.class,
              com.google.spanner.executor.v1.WriteMutationsAction.Builder.class);
    }

    // Construct using com.google.spanner.executor.v1.WriteMutationsAction.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMutationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      mutation_ = null;
      if (mutationBuilder_ != null) {
        mutationBuilder_.dispose();
        mutationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.executor.v1.CloudExecutorProto
          .internal_static_google_spanner_executor_v1_WriteMutationsAction_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.WriteMutationsAction getDefaultInstanceForType() {
      return com.google.spanner.executor.v1.WriteMutationsAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.WriteMutationsAction build() {
      com.google.spanner.executor.v1.WriteMutationsAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.executor.v1.WriteMutationsAction buildPartial() {
      com.google.spanner.executor.v1.WriteMutationsAction result =
          new com.google.spanner.executor.v1.WriteMutationsAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.spanner.executor.v1.WriteMutationsAction result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mutation_ = mutationBuilder_ == null ? mutation_ : mutationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.spanner.executor.v1.WriteMutationsAction) {
        return mergeFrom((com.google.spanner.executor.v1.WriteMutationsAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.executor.v1.WriteMutationsAction other) {
      if (other == com.google.spanner.executor.v1.WriteMutationsAction.getDefaultInstance())
        return this;
      if (other.hasMutation()) {
        mergeMutation(other.getMutation());
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
                input.readMessage(getMutationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private int bitField0_;

    private com.google.spanner.executor.v1.MutationAction mutation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.executor.v1.MutationAction,
            com.google.spanner.executor.v1.MutationAction.Builder,
            com.google.spanner.executor.v1.MutationActionOrBuilder>
        mutationBuilder_;
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     *
     * @return Whether the mutation field is set.
     */
    public boolean hasMutation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     *
     * @return The mutation.
     */
    public com.google.spanner.executor.v1.MutationAction getMutation() {
      if (mutationBuilder_ == null) {
        return mutation_ == null
            ? com.google.spanner.executor.v1.MutationAction.getDefaultInstance()
            : mutation_;
      } else {
        return mutationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     */
    public Builder setMutation(com.google.spanner.executor.v1.MutationAction value) {
      if (mutationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mutation_ = value;
      } else {
        mutationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     */
    public Builder setMutation(
        com.google.spanner.executor.v1.MutationAction.Builder builderForValue) {
      if (mutationBuilder_ == null) {
        mutation_ = builderForValue.build();
      } else {
        mutationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     */
    public Builder mergeMutation(com.google.spanner.executor.v1.MutationAction value) {
      if (mutationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && mutation_ != null
            && mutation_ != com.google.spanner.executor.v1.MutationAction.getDefaultInstance()) {
          getMutationBuilder().mergeFrom(value);
        } else {
          mutation_ = value;
        }
      } else {
        mutationBuilder_.mergeFrom(value);
      }
      if (mutation_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     */
    public Builder clearMutation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mutation_ = null;
      if (mutationBuilder_ != null) {
        mutationBuilder_.dispose();
        mutationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     */
    public com.google.spanner.executor.v1.MutationAction.Builder getMutationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMutationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     */
    public com.google.spanner.executor.v1.MutationActionOrBuilder getMutationOrBuilder() {
      if (mutationBuilder_ != null) {
        return mutationBuilder_.getMessageOrBuilder();
      } else {
        return mutation_ == null
            ? com.google.spanner.executor.v1.MutationAction.getDefaultInstance()
            : mutation_;
      }
    }
    /**
     *
     *
     * <pre>
     * The mutation to write.
     * </pre>
     *
     * <code>.google.spanner.executor.v1.MutationAction mutation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.executor.v1.MutationAction,
            com.google.spanner.executor.v1.MutationAction.Builder,
            com.google.spanner.executor.v1.MutationActionOrBuilder>
        getMutationFieldBuilder() {
      if (mutationBuilder_ == null) {
        mutationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.spanner.executor.v1.MutationAction,
                com.google.spanner.executor.v1.MutationAction.Builder,
                com.google.spanner.executor.v1.MutationActionOrBuilder>(
                getMutation(), getParentForChildren(), isClean());
        mutation_ = null;
      }
      return mutationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.spanner.executor.v1.WriteMutationsAction)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.executor.v1.WriteMutationsAction)
  private static final com.google.spanner.executor.v1.WriteMutationsAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.executor.v1.WriteMutationsAction();
  }

  public static com.google.spanner.executor.v1.WriteMutationsAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WriteMutationsAction> PARSER =
      new com.google.protobuf.AbstractParser<WriteMutationsAction>() {
        @java.lang.Override
        public WriteMutationsAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<WriteMutationsAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WriteMutationsAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.executor.v1.WriteMutationsAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
