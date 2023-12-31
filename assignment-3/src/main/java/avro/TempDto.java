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
public class TempDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4115632152141501760L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TempDto\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"planName\",\"type\":[\"null\",\"string\"]},{\"name\":\"productName\",\"type\":[\"null\",\"string\"]},{\"name\":\"quantity\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TempDto> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TempDto> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TempDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TempDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TempDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TempDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TempDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TempDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TempDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence id;
  private java.lang.CharSequence planName;
  private java.lang.CharSequence productName;
  private java.lang.CharSequence quantity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TempDto() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param planName The new value for planName
   * @param productName The new value for productName
   * @param quantity The new value for quantity
   */
  public TempDto(java.lang.CharSequence id, java.lang.CharSequence planName, java.lang.CharSequence productName, java.lang.CharSequence quantity) {
    this.id = id;
    this.planName = planName;
    this.productName = productName;
    this.quantity = quantity;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return planName;
    case 2: return productName;
    case 3: return quantity;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: planName = (java.lang.CharSequence)value$; break;
    case 2: productName = (java.lang.CharSequence)value$; break;
    case 3: quantity = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'planName' field.
   * @return The value of the 'planName' field.
   */
  public java.lang.CharSequence getPlanName() {
    return planName;
  }


  /**
   * Sets the value of the 'planName' field.
   * @param value the value to set.
   */
  public void setPlanName(java.lang.CharSequence value) {
    this.planName = value;
  }

  /**
   * Gets the value of the 'productName' field.
   * @return The value of the 'productName' field.
   */
  public java.lang.CharSequence getProductName() {
    return productName;
  }


  /**
   * Sets the value of the 'productName' field.
   * @param value the value to set.
   */
  public void setProductName(java.lang.CharSequence value) {
    this.productName = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public java.lang.CharSequence getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.lang.CharSequence value) {
    this.quantity = value;
  }

  /**
   * Creates a new TempDto RecordBuilder.
   * @return A new TempDto RecordBuilder
   */
  public static avro.TempDto.Builder newBuilder() {
    return new avro.TempDto.Builder();
  }

  /**
   * Creates a new TempDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TempDto RecordBuilder
   */
  public static avro.TempDto.Builder newBuilder(avro.TempDto.Builder other) {
    if (other == null) {
      return new avro.TempDto.Builder();
    } else {
      return new avro.TempDto.Builder(other);
    }
  }

  /**
   * Creates a new TempDto RecordBuilder by copying an existing TempDto instance.
   * @param other The existing instance to copy.
   * @return A new TempDto RecordBuilder
   */
  public static avro.TempDto.Builder newBuilder(avro.TempDto other) {
    if (other == null) {
      return new avro.TempDto.Builder();
    } else {
      return new avro.TempDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for TempDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TempDto>
    implements org.apache.avro.data.RecordBuilder<TempDto> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence planName;
    private java.lang.CharSequence productName;
    private java.lang.CharSequence quantity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.TempDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.planName)) {
        this.planName = data().deepCopy(fields()[1].schema(), other.planName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.productName)) {
        this.productName = data().deepCopy(fields()[2].schema(), other.productName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.quantity)) {
        this.quantity = data().deepCopy(fields()[3].schema(), other.quantity);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing TempDto instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.TempDto other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.planName)) {
        this.planName = data().deepCopy(fields()[1].schema(), other.planName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.productName)) {
        this.productName = data().deepCopy(fields()[2].schema(), other.productName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.quantity)) {
        this.quantity = data().deepCopy(fields()[3].schema(), other.quantity);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public avro.TempDto.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public avro.TempDto.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'planName' field.
      * @return The value.
      */
    public java.lang.CharSequence getPlanName() {
      return planName;
    }


    /**
      * Sets the value of the 'planName' field.
      * @param value The value of 'planName'.
      * @return This builder.
      */
    public avro.TempDto.Builder setPlanName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.planName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'planName' field has been set.
      * @return True if the 'planName' field has been set, false otherwise.
      */
    public boolean hasPlanName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'planName' field.
      * @return This builder.
      */
    public avro.TempDto.Builder clearPlanName() {
      planName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'productName' field.
      * @return The value.
      */
    public java.lang.CharSequence getProductName() {
      return productName;
    }


    /**
      * Sets the value of the 'productName' field.
      * @param value The value of 'productName'.
      * @return This builder.
      */
    public avro.TempDto.Builder setProductName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.productName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'productName' field has been set.
      * @return True if the 'productName' field has been set, false otherwise.
      */
    public boolean hasProductName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'productName' field.
      * @return This builder.
      */
    public avro.TempDto.Builder clearProductName() {
      productName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public java.lang.CharSequence getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public avro.TempDto.Builder setQuantity(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.quantity = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public avro.TempDto.Builder clearQuantity() {
      quantity = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TempDto build() {
      try {
        TempDto record = new TempDto();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.planName = fieldSetFlags()[1] ? this.planName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.productName = fieldSetFlags()[2] ? this.productName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.quantity = fieldSetFlags()[3] ? this.quantity : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TempDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<TempDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TempDto>
    READER$ = (org.apache.avro.io.DatumReader<TempDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    if (this.planName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.planName);
    }

    if (this.productName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.productName);
    }

    if (this.quantity == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.quantity);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.planName = null;
      } else {
        this.planName = in.readString(this.planName instanceof Utf8 ? (Utf8)this.planName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.productName = null;
      } else {
        this.productName = in.readString(this.productName instanceof Utf8 ? (Utf8)this.productName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.quantity = null;
      } else {
        this.quantity = in.readString(this.quantity instanceof Utf8 ? (Utf8)this.quantity : null);
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.planName = null;
          } else {
            this.planName = in.readString(this.planName instanceof Utf8 ? (Utf8)this.planName : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.productName = null;
          } else {
            this.productName = in.readString(this.productName instanceof Utf8 ? (Utf8)this.productName : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.quantity = null;
          } else {
            this.quantity = in.readString(this.quantity instanceof Utf8 ? (Utf8)this.quantity : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










