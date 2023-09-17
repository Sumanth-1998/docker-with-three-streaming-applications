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
public class UserFineDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7073529396206040913L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserFineDto\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"fines\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Fine\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"fineReason\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"fineAmount\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"fineDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ssn\",\"type\":[\"null\",\"string\"],\"default\":null}]}}]},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"ssn\",\"type\":[\"null\",\"string\"]},{\"name\":\"email\",\"type\":[\"null\",\"string\"]},{\"name\":\"dob\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserFineDto> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserFineDto> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UserFineDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UserFineDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UserFineDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UserFineDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UserFineDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UserFineDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UserFineDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.List<avro.Fine> fines;
  private java.lang.CharSequence name;
  private java.lang.CharSequence ssn;
  private java.lang.CharSequence email;
  private java.lang.CharSequence dob;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserFineDto() {}

  /**
   * All-args constructor.
   * @param fines The new value for fines
   * @param name The new value for name
   * @param ssn The new value for ssn
   * @param email The new value for email
   * @param dob The new value for dob
   */
  public UserFineDto(java.util.List<avro.Fine> fines, java.lang.CharSequence name, java.lang.CharSequence ssn, java.lang.CharSequence email, java.lang.CharSequence dob) {
    this.fines = fines;
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
    case 0: return fines;
    case 1: return name;
    case 2: return ssn;
    case 3: return email;
    case 4: return dob;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fines = (java.util.List<avro.Fine>)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: ssn = (java.lang.CharSequence)value$; break;
    case 3: email = (java.lang.CharSequence)value$; break;
    case 4: dob = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'fines' field.
   * @return The value of the 'fines' field.
   */
  public java.util.List<avro.Fine> getFines() {
    return fines;
  }


  /**
   * Sets the value of the 'fines' field.
   * @param value the value to set.
   */
  public void setFines(java.util.List<avro.Fine> value) {
    this.fines = value;
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
   * Creates a new UserFineDto RecordBuilder.
   * @return A new UserFineDto RecordBuilder
   */
  public static avro.UserFineDto.Builder newBuilder() {
    return new avro.UserFineDto.Builder();
  }

  /**
   * Creates a new UserFineDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserFineDto RecordBuilder
   */
  public static avro.UserFineDto.Builder newBuilder(avro.UserFineDto.Builder other) {
    if (other == null) {
      return new avro.UserFineDto.Builder();
    } else {
      return new avro.UserFineDto.Builder(other);
    }
  }

  /**
   * Creates a new UserFineDto RecordBuilder by copying an existing UserFineDto instance.
   * @param other The existing instance to copy.
   * @return A new UserFineDto RecordBuilder
   */
  public static avro.UserFineDto.Builder newBuilder(avro.UserFineDto other) {
    if (other == null) {
      return new avro.UserFineDto.Builder();
    } else {
      return new avro.UserFineDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for UserFineDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserFineDto>
    implements org.apache.avro.data.RecordBuilder<UserFineDto> {

    private java.util.List<avro.Fine> fines;
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
    private Builder(avro.UserFineDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fines)) {
        this.fines = data().deepCopy(fields()[0].schema(), other.fines);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.ssn)) {
        this.ssn = data().deepCopy(fields()[2].schema(), other.ssn);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.email)) {
        this.email = data().deepCopy(fields()[3].schema(), other.email);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.dob)) {
        this.dob = data().deepCopy(fields()[4].schema(), other.dob);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing UserFineDto instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.UserFineDto other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.fines)) {
        this.fines = data().deepCopy(fields()[0].schema(), other.fines);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ssn)) {
        this.ssn = data().deepCopy(fields()[2].schema(), other.ssn);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.email)) {
        this.email = data().deepCopy(fields()[3].schema(), other.email);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.dob)) {
        this.dob = data().deepCopy(fields()[4].schema(), other.dob);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'fines' field.
      * @return The value.
      */
    public java.util.List<avro.Fine> getFines() {
      return fines;
    }


    /**
      * Sets the value of the 'fines' field.
      * @param value The value of 'fines'.
      * @return This builder.
      */
    public avro.UserFineDto.Builder setFines(java.util.List<avro.Fine> value) {
      validate(fields()[0], value);
      this.fines = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'fines' field has been set.
      * @return True if the 'fines' field has been set, false otherwise.
      */
    public boolean hasFines() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'fines' field.
      * @return This builder.
      */
    public avro.UserFineDto.Builder clearFines() {
      fines = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public avro.UserFineDto.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public avro.UserFineDto.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
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
    public avro.UserFineDto.Builder setSsn(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ssn = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ssn' field has been set.
      * @return True if the 'ssn' field has been set, false otherwise.
      */
    public boolean hasSsn() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ssn' field.
      * @return This builder.
      */
    public avro.UserFineDto.Builder clearSsn() {
      ssn = null;
      fieldSetFlags()[2] = false;
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
    public avro.UserFineDto.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.email = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public avro.UserFineDto.Builder clearEmail() {
      email = null;
      fieldSetFlags()[3] = false;
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
    public avro.UserFineDto.Builder setDob(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.dob = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'dob' field has been set.
      * @return True if the 'dob' field has been set, false otherwise.
      */
    public boolean hasDob() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'dob' field.
      * @return This builder.
      */
    public avro.UserFineDto.Builder clearDob() {
      dob = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserFineDto build() {
      try {
        UserFineDto record = new UserFineDto();
        record.fines = fieldSetFlags()[0] ? this.fines : (java.util.List<avro.Fine>) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ssn = fieldSetFlags()[2] ? this.ssn : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.email = fieldSetFlags()[3] ? this.email : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.dob = fieldSetFlags()[4] ? this.dob : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserFineDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserFineDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserFineDto>
    READER$ = (org.apache.avro.io.DatumReader<UserFineDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.fines == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.fines.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (avro.Fine e0: this.fines) {
        actualSize0++;
        out.startItem();
        e0.customEncode(out);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

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
        this.fines = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<avro.Fine> a0 = this.fines;
        if (a0 == null) {
          a0 = new SpecificData.Array<avro.Fine>((int)size0, SCHEMA$.getField("fines").schema().getTypes().get(1));
          this.fines = a0;
        } else a0.clear();
        SpecificData.Array<avro.Fine> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<avro.Fine>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            avro.Fine e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new avro.Fine();
            }
            e0.customDecode(in);
            a0.add(e0);
          }
        }
      }

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
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.fines = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<avro.Fine> a0 = this.fines;
            if (a0 == null) {
              a0 = new SpecificData.Array<avro.Fine>((int)size0, SCHEMA$.getField("fines").schema().getTypes().get(1));
              this.fines = a0;
            } else a0.clear();
            SpecificData.Array<avro.Fine> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<avro.Fine>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                avro.Fine e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new avro.Fine();
                }
                e0.customDecode(in);
                a0.add(e0);
              }
            }
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ssn = null;
          } else {
            this.ssn = in.readString(this.ssn instanceof Utf8 ? (Utf8)this.ssn : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.email = null;
          } else {
            this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          }
          break;

        case 4:
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










