/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class UserInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1033863585861531337L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserInformation\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ssn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"email\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"dob\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserInformation> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserInformation> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UserInformation> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UserInformation> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UserInformation> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UserInformation to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UserInformation from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UserInformation instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UserInformation fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private java.lang.CharSequence ssn;
  private java.lang.CharSequence email;
  private java.lang.CharSequence dob;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserInformation() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param ssn The new value for ssn
   * @param email The new value for email
   * @param dob The new value for dob
   */
  public UserInformation(java.lang.CharSequence name, java.lang.CharSequence ssn, java.lang.CharSequence email, java.lang.CharSequence dob) {
    this.name = name;
    this.ssn = ssn;
    this.email = email;
    this.dob = dob;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return ssn;
    case 2: return email;
    case 3: return dob;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: ssn = (java.lang.CharSequence)value$; break;
    case 2: email = (java.lang.CharSequence)value$; break;
    case 3: dob = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'ssn' field.
   * @return The value of the 'ssn' field.
   */
  public java.lang.CharSequence getSsn() {
    return ssn;
  }


  /**
   * Sets the value of the 'ssn' field.
   * @param value the value to set.
   */
  public void setSsn(java.lang.CharSequence value) {
    this.ssn = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'dob' field.
   * @return The value of the 'dob' field.
   */
  public java.lang.CharSequence getDob() {
    return dob;
  }


  /**
   * Sets the value of the 'dob' field.
   * @param value the value to set.
   */
  public void setDob(java.lang.CharSequence value) {
    this.dob = value;
  }

  /**
   * Creates a new UserInformation RecordBuilder.
   * @return A new UserInformation RecordBuilder
   */
  public static avro.UserInformation.Builder newBuilder() {
    return new avro.UserInformation.Builder();
  }

  /**
   * Creates a new UserInformation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserInformation RecordBuilder
   */
  public static avro.UserInformation.Builder newBuilder(avro.UserInformation.Builder other) {
    if (other == null) {
      return new avro.UserInformation.Builder();
    } else {
      return new avro.UserInformation.Builder(other);
    }
  }

  /**
   * Creates a new UserInformation RecordBuilder by copying an existing UserInformation instance.
   * @param other The existing instance to copy.
   * @return A new UserInformation RecordBuilder
   */
  public static avro.UserInformation.Builder newBuilder(avro.UserInformation other) {
    if (other == null) {
      return new avro.UserInformation.Builder();
    } else {
      return new avro.UserInformation.Builder(other);
    }
  }

  /**
   * RecordBuilder for UserInformation instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserInformation>
    implements org.apache.avro.data.RecordBuilder<UserInformation> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence ssn;
    private java.lang.CharSequence email;
    private java.lang.CharSequence dob;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.UserInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ssn)) {
        this.ssn = data().deepCopy(fields()[1].schema(), other.ssn);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.dob)) {
        this.dob = data().deepCopy(fields()[3].schema(), other.dob);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing UserInformation instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.UserInformation other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ssn)) {
        this.ssn = data().deepCopy(fields()[1].schema(), other.ssn);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.dob)) {
        this.dob = data().deepCopy(fields()[3].schema(), other.dob);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public avro.UserInformation.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public avro.UserInformation.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ssn' field.
      * @return The value.
      */
    public java.lang.CharSequence getSsn() {
      return ssn;
    }


    /**
      * Sets the value of the 'ssn' field.
      * @param value The value of 'ssn'.
      * @return This builder.
      */
    public avro.UserInformation.Builder setSsn(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ssn = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ssn' field has been set.
      * @return True if the 'ssn' field has been set, false otherwise.
      */
    public boolean hasSsn() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ssn' field.
      * @return This builder.
      */
    public avro.UserInformation.Builder clearSsn() {
      ssn = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public avro.UserInformation.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.email = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public avro.UserInformation.Builder clearEmail() {
      email = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'dob' field.
      * @return The value.
      */
    public java.lang.CharSequence getDob() {
      return dob;
    }


    /**
      * Sets the value of the 'dob' field.
      * @param value The value of 'dob'.
      * @return This builder.
      */
    public avro.UserInformation.Builder setDob(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.dob = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'dob' field has been set.
      * @return True if the 'dob' field has been set, false otherwise.
      */
    public boolean hasDob() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'dob' field.
      * @return This builder.
      */
    public avro.UserInformation.Builder clearDob() {
      dob = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserInformation build() {
      try {
        UserInformation record = new UserInformation();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ssn = fieldSetFlags()[1] ? this.ssn : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.email = fieldSetFlags()[2] ? this.email : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.dob = fieldSetFlags()[3] ? this.dob : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserInformation>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserInformation>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserInformation>
    READER$ = (org.apache.avro.io.DatumReader<UserInformation>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.name);
    }

    if (this.ssn == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.ssn);
    }

    if (this.email == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.email);
    }

    if (this.dob == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.dob);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.name = null;
      } else {
        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.ssn = null;
      } else {
        this.ssn = in.readString(this.ssn instanceof Utf8 ? (Utf8)this.ssn : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.email = null;
      } else {
        this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.dob = null;
      } else {
        this.dob = in.readString(this.dob instanceof Utf8 ? (Utf8)this.dob : null);
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ssn = null;
          } else {
            this.ssn = in.readString(this.ssn instanceof Utf8 ? (Utf8)this.ssn : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.email = null;
          } else {
            this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.dob = null;
          } else {
            this.dob = in.readString(this.dob instanceof Utf8 ? (Utf8)this.dob : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










