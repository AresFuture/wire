// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: simple_message.proto at 24:1
package com.squareup.wire.protos.simple;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.protos.foreign.ForeignEnum;
import java.io.IOException;
import java.lang.Deprecated;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * A message for testing.
 */
public final class SimpleMessage extends Message<SimpleMessage, SimpleMessage.Builder> {
  public static final ProtoAdapter<SimpleMessage> ADAPTER = new ProtoAdapter<SimpleMessage>(FieldEncoding.LENGTH_DELIMITED, SimpleMessage.class) {
    @Override
    public int encodedSize(SimpleMessage value) {
      return (value.optional_int32 != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.optional_int32) : 0)
          + (value.optional_nested_msg != null ? NestedMessage.ADAPTER.encodedSizeWithTag(2, value.optional_nested_msg) : 0)
          + (value.optional_external_msg != null ? ExternalMessage.ADAPTER.encodedSizeWithTag(3, value.optional_external_msg) : 0)
          + (value.default_nested_enum != null ? NestedEnum.ADAPTER.encodedSizeWithTag(4, value.default_nested_enum) : 0)
          + ProtoAdapter.INT32.encodedSizeWithTag(5, value.required_int32)
          + ProtoAdapter.DOUBLE.asRepeated().encodedSizeWithTag(6, value.repeated_double)
          + (value.default_foreign_enum != null ? ForeignEnum.ADAPTER.encodedSizeWithTag(7, value.default_foreign_enum) : 0)
          + (value.no_default_foreign_enum != null ? ForeignEnum.ADAPTER.encodedSizeWithTag(8, value.no_default_foreign_enum) : 0)
          + (value.package_ != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.package_) : 0)
          + (value.result != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.result) : 0)
          + (value.other != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.other) : 0)
          + (value.o != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.o) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SimpleMessage value) throws IOException {
      if (value.optional_int32 != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.optional_int32);
      if (value.optional_nested_msg != null) NestedMessage.ADAPTER.encodeWithTag(writer, 2, value.optional_nested_msg);
      if (value.optional_external_msg != null) ExternalMessage.ADAPTER.encodeWithTag(writer, 3, value.optional_external_msg);
      if (value.default_nested_enum != null) NestedEnum.ADAPTER.encodeWithTag(writer, 4, value.default_nested_enum);
      ProtoAdapter.INT32.encodeWithTag(writer, 5, value.required_int32);
      if (value.repeated_double != null) ProtoAdapter.DOUBLE.asRepeated().encodeWithTag(writer, 6, value.repeated_double);
      if (value.default_foreign_enum != null) ForeignEnum.ADAPTER.encodeWithTag(writer, 7, value.default_foreign_enum);
      if (value.no_default_foreign_enum != null) ForeignEnum.ADAPTER.encodeWithTag(writer, 8, value.no_default_foreign_enum);
      if (value.package_ != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.package_);
      if (value.result != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.result);
      if (value.other != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.other);
      if (value.o != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.o);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SimpleMessage decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.optional_int32(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.optional_nested_msg(NestedMessage.ADAPTER.decode(reader)); break;
          case 3: builder.optional_external_msg(ExternalMessage.ADAPTER.decode(reader)); break;
          case 4: {
            try {
              builder.default_nested_enum(NestedEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 5: builder.required_int32(ProtoAdapter.INT32.decode(reader)); break;
          case 6: builder.repeated_double.add(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 7: {
            try {
              builder.default_foreign_enum(ForeignEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 8: {
            try {
              builder.no_default_foreign_enum(ForeignEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 9: builder.package_(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.result(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.other(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.o(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public SimpleMessage redact(SimpleMessage value) {
      Builder builder = value.newBuilder();
      if (builder.optional_nested_msg != null) builder.optional_nested_msg = NestedMessage.ADAPTER.redact(builder.optional_nested_msg);
      if (builder.optional_external_msg != null) builder.optional_external_msg = ExternalMessage.ADAPTER.redact(builder.optional_external_msg);
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_OPTIONAL_INT32 = 123;

  public static final NestedEnum DEFAULT_DEFAULT_NESTED_ENUM = NestedEnum.BAZ;

  public static final Integer DEFAULT_REQUIRED_INT32 = 456;

  public static final ForeignEnum DEFAULT_DEFAULT_FOREIGN_ENUM = ForeignEnum.BAX;

  public static final ForeignEnum DEFAULT_NO_DEFAULT_FOREIGN_ENUM = ForeignEnum.BAV;

  public static final String DEFAULT_PACKAGE_ = "";

  public static final String DEFAULT_RESULT = "";

  public static final String DEFAULT_OTHER = "";

  public static final String DEFAULT_O = "";

  /**
   * An optional int32
   */
  public final Integer optional_int32;

  /**
   * An optional NestedMessage, deprecated
   */
  @Deprecated
  public final NestedMessage optional_nested_msg;

  /**
   * An optional ExternalMessage
   */
  public final ExternalMessage optional_external_msg;

  public final NestedEnum default_nested_enum;

  /**
   * A required int32
   */
  public final Integer required_int32;

  /**
   * A repeated double, deprecated
   */
  @Deprecated
  public final List<Double> repeated_double;

  /**
   * enum from another package with an explicit default
   */
  public final ForeignEnum default_foreign_enum;

  /**
   * enum from another package without an explicit default
   */
  public final ForeignEnum no_default_foreign_enum;

  /**
   * field with the same name as a Java keyword
   */
  public final String package_;

  /**
   * field with the name "result"
   */
  public final String result;

  /**
   * field with the name "other"
   */
  public final String other;

  /**
   * field with the name "o"
   */
  public final String o;

  public SimpleMessage(Integer optional_int32, NestedMessage optional_nested_msg, ExternalMessage optional_external_msg, NestedEnum default_nested_enum, Integer required_int32, List<Double> repeated_double, ForeignEnum default_foreign_enum, ForeignEnum no_default_foreign_enum, String package_, String result, String other, String o) {
    this(optional_int32, optional_nested_msg, optional_external_msg, default_nested_enum, required_int32, repeated_double, default_foreign_enum, no_default_foreign_enum, package_, result, other, o, ByteString.EMPTY);
  }

  public SimpleMessage(Integer optional_int32, NestedMessage optional_nested_msg, ExternalMessage optional_external_msg, NestedEnum default_nested_enum, Integer required_int32, List<Double> repeated_double, ForeignEnum default_foreign_enum, ForeignEnum no_default_foreign_enum, String package_, String result, String other, String o, ByteString unknownFields) {
    super(unknownFields);
    this.optional_int32 = optional_int32;
    this.optional_nested_msg = optional_nested_msg;
    this.optional_external_msg = optional_external_msg;
    this.default_nested_enum = default_nested_enum;
    this.required_int32 = required_int32;
    this.repeated_double = immutableCopyOf("repeated_double", repeated_double);
    this.default_foreign_enum = default_foreign_enum;
    this.no_default_foreign_enum = no_default_foreign_enum;
    this.package_ = package_;
    this.result = result;
    this.other = other;
    this.o = o;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.optional_int32 = optional_int32;
    builder.optional_nested_msg = optional_nested_msg;
    builder.optional_external_msg = optional_external_msg;
    builder.default_nested_enum = default_nested_enum;
    builder.required_int32 = required_int32;
    builder.repeated_double = copyOf("repeated_double", repeated_double);
    builder.default_foreign_enum = default_foreign_enum;
    builder.no_default_foreign_enum = no_default_foreign_enum;
    builder.package_ = package_;
    builder.result = result;
    builder.other = other;
    builder.o = o;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other_) {
    if (other_ == this) return true;
    if (!(other_ instanceof SimpleMessage)) return false;
    SimpleMessage o_ = (SimpleMessage) other_;
    return equals(unknownFields(), o_.unknownFields())
        && equals(optional_int32, o_.optional_int32)
        && equals(optional_nested_msg, o_.optional_nested_msg)
        && equals(optional_external_msg, o_.optional_external_msg)
        && equals(default_nested_enum, o_.default_nested_enum)
        && equals(required_int32, o_.required_int32)
        && equals(repeated_double, o_.repeated_double)
        && equals(default_foreign_enum, o_.default_foreign_enum)
        && equals(no_default_foreign_enum, o_.no_default_foreign_enum)
        && equals(package_, o_.package_)
        && equals(result, o_.result)
        && equals(other, o_.other)
        && equals(o, o_.o);
  }

  @Override
  public int hashCode() {
    int result_ = super.hashCode;
    if (result_ == 0) {
      result_ = unknownFields().hashCode();
      result_ = result_ * 37 + (optional_int32 != null ? optional_int32.hashCode() : 0);
      result_ = result_ * 37 + (optional_nested_msg != null ? optional_nested_msg.hashCode() : 0);
      result_ = result_ * 37 + (optional_external_msg != null ? optional_external_msg.hashCode() : 0);
      result_ = result_ * 37 + (default_nested_enum != null ? default_nested_enum.hashCode() : 0);
      result_ = result_ * 37 + (required_int32 != null ? required_int32.hashCode() : 0);
      result_ = result_ * 37 + (repeated_double != null ? repeated_double.hashCode() : 1);
      result_ = result_ * 37 + (default_foreign_enum != null ? default_foreign_enum.hashCode() : 0);
      result_ = result_ * 37 + (no_default_foreign_enum != null ? no_default_foreign_enum.hashCode() : 0);
      result_ = result_ * 37 + (package_ != null ? package_.hashCode() : 0);
      result_ = result_ * 37 + (result != null ? result.hashCode() : 0);
      result_ = result_ * 37 + (other != null ? other.hashCode() : 0);
      result_ = result_ * 37 + (o != null ? o.hashCode() : 0);
      super.hashCode = result_;
    }
    return result_;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (optional_int32 != null) builder.append(", optional_int32=").append(optional_int32);
    if (optional_nested_msg != null) builder.append(", optional_nested_msg=").append(optional_nested_msg);
    if (optional_external_msg != null) builder.append(", optional_external_msg=").append(optional_external_msg);
    if (default_nested_enum != null) builder.append(", default_nested_enum=").append(default_nested_enum);
    if (required_int32 != null) builder.append(", required_int32=").append(required_int32);
    if (repeated_double != null) builder.append(", repeated_double=").append(repeated_double);
    if (default_foreign_enum != null) builder.append(", default_foreign_enum=").append(default_foreign_enum);
    if (no_default_foreign_enum != null) builder.append(", no_default_foreign_enum=").append(no_default_foreign_enum);
    if (package_ != null) builder.append(", package=").append(package_);
    if (result != null) builder.append(", result=").append(result);
    if (other != null) builder.append(", other=").append(other);
    if (o != null) builder.append(", o=").append(o);
    return builder.replace(0, 2, "SimpleMessage{").append('}').toString();
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<SimpleMessage, Builder> {
    public Integer optional_int32;

    public NestedMessage optional_nested_msg;

    public ExternalMessage optional_external_msg;

    public NestedEnum default_nested_enum;

    public Integer required_int32;

    public List<Double> repeated_double;

    public ForeignEnum default_foreign_enum;

    public ForeignEnum no_default_foreign_enum;

    public String package_;

    public String result;

    public String other;

    public String o;

    public Builder() {
      repeated_double = newMutableList();
    }

    /**
     * An optional int32
     */
    public Builder optional_int32(Integer optional_int32) {
      this.optional_int32 = optional_int32;
      return this;
    }

    /**
     * An optional NestedMessage, deprecated
     */
    @Deprecated
    public Builder optional_nested_msg(NestedMessage optional_nested_msg) {
      this.optional_nested_msg = optional_nested_msg;
      return this;
    }

    /**
     * An optional ExternalMessage
     */
    public Builder optional_external_msg(ExternalMessage optional_external_msg) {
      this.optional_external_msg = optional_external_msg;
      return this;
    }

    public Builder default_nested_enum(NestedEnum default_nested_enum) {
      this.default_nested_enum = default_nested_enum;
      return this;
    }

    /**
     * A required int32
     */
    public Builder required_int32(Integer required_int32) {
      this.required_int32 = required_int32;
      return this;
    }

    /**
     * A repeated double, deprecated
     */
    @Deprecated
    public Builder repeated_double(List<Double> repeated_double) {
      checkElementsNotNull(repeated_double);
      this.repeated_double = repeated_double;
      return this;
    }

    /**
     * enum from another package with an explicit default
     */
    public Builder default_foreign_enum(ForeignEnum default_foreign_enum) {
      this.default_foreign_enum = default_foreign_enum;
      return this;
    }

    /**
     * enum from another package without an explicit default
     */
    public Builder no_default_foreign_enum(ForeignEnum no_default_foreign_enum) {
      this.no_default_foreign_enum = no_default_foreign_enum;
      return this;
    }

    /**
     * field with the same name as a Java keyword
     */
    public Builder package_(String package_) {
      this.package_ = package_;
      return this;
    }

    /**
     * field with the name "result"
     */
    public Builder result(String result) {
      this.result = result;
      return this;
    }

    /**
     * field with the name "other"
     */
    public Builder other(String other) {
      this.other = other;
      return this;
    }

    /**
     * field with the name "o"
     */
    public Builder o(String o) {
      this.o = o;
      return this;
    }

    @Override
    public SimpleMessage build() {
      if (required_int32 == null) {
        throw missingRequiredFields(required_int32, "required_int32");
      }
      return new SimpleMessage(optional_int32, optional_nested_msg, optional_external_msg, default_nested_enum, required_int32, repeated_double, default_foreign_enum, no_default_foreign_enum, package_, result, other, o, buildUnknownFields());
    }
  }

  public static final class NestedMessage extends Message<NestedMessage, NestedMessage.Builder> {
    public static final ProtoAdapter<NestedMessage> ADAPTER = new ProtoAdapter<NestedMessage>(FieldEncoding.LENGTH_DELIMITED, NestedMessage.class) {
      @Override
      public int encodedSize(NestedMessage value) {
        return (value.bb != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.bb) : 0)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, NestedMessage value) throws IOException {
        if (value.bb != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.bb);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public NestedMessage decode(ProtoReader reader) throws IOException {
        NestedMessage.Builder builder = new NestedMessage.Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.bb(ProtoAdapter.INT32.decode(reader)); break;
            default: {
              FieldEncoding fieldEncoding = reader.peekFieldEncoding();
              Object value = fieldEncoding.rawProtoAdapter().decode(reader);
              builder.addUnknownField(tag, fieldEncoding, value);
            }
          }
        }
        reader.endMessage(token);
        return builder.build();
      }

      @Override
      public NestedMessage redact(NestedMessage value) {
        NestedMessage.Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    };

    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_BB = 0;

    /**
     * An optional int32
     */
    public final Integer bb;

    public NestedMessage(Integer bb) {
      this(bb, ByteString.EMPTY);
    }

    public NestedMessage(Integer bb, ByteString unknownFields) {
      super(unknownFields);
      this.bb = bb;
    }

    @Override
    public NestedMessage.Builder newBuilder() {
      NestedMessage.Builder builder = new NestedMessage.Builder();
      builder.bb = bb;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof NestedMessage)) return false;
      NestedMessage o = (NestedMessage) other;
      return equals(unknownFields(), o.unknownFields())
          && equals(bb, o.bb);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (bb != null ? bb.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (bb != null) builder.append(", bb=").append(bb);
      return builder.replace(0, 2, "NestedMessage{").append('}').toString();
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<NestedMessage, NestedMessage.Builder> {
      public Integer bb;

      public Builder() {
      }

      /**
       * An optional int32
       */
      public Builder bb(Integer bb) {
        this.bb = bb;
        return this;
      }

      @Override
      public NestedMessage build() {
        return new NestedMessage(bb, buildUnknownFields());
      }
    }
  }

  public enum NestedEnum implements WireEnum {
    FOO(1),

    BAR(2),

    BAZ(3);

    public static final ProtoAdapter<NestedEnum> ADAPTER = ProtoAdapter.newEnumAdapter(NestedEnum.class);

    private final int value;

    NestedEnum(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static NestedEnum fromValue(int value) {
      switch (value) {
        case 1: return FOO;
        case 2: return BAR;
        case 3: return BAZ;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
