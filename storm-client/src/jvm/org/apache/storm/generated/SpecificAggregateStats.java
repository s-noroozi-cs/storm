/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)")
public class SpecificAggregateStats extends org.apache.storm.thrift.TUnion<SpecificAggregateStats, SpecificAggregateStats._Fields> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("SpecificAggregateStats");
  private static final org.apache.storm.thrift.protocol.TField BOLT_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("bolt", org.apache.storm.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.storm.thrift.protocol.TField SPOUT_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("spout", org.apache.storm.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    BOLT((short)1, "bolt"),
    SPOUT((short)2, "spout");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BOLT
          return BOLT;
        case 2: // SPOUT
          return SPOUT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOLT, new org.apache.storm.thrift.meta_data.FieldMetaData("bolt", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, BoltAggregateStats.class)));
    tmpMap.put(_Fields.SPOUT, new org.apache.storm.thrift.meta_data.FieldMetaData("spout", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, SpoutAggregateStats.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SpecificAggregateStats.class, metaDataMap);
  }

  public SpecificAggregateStats() {
    super();
  }

  public SpecificAggregateStats(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public SpecificAggregateStats(SpecificAggregateStats other) {
    super(other);
  }
  @Override
  public SpecificAggregateStats deepCopy() {
    return new SpecificAggregateStats(this);
  }

  public static SpecificAggregateStats bolt(BoltAggregateStats value) {
    SpecificAggregateStats x = new SpecificAggregateStats();
    x.set_bolt(value);
    return x;
  }

  public static SpecificAggregateStats spout(SpoutAggregateStats value) {
    SpecificAggregateStats x = new SpecificAggregateStats();
    x.set_spout(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case BOLT:
        if (value instanceof BoltAggregateStats) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type BoltAggregateStats for field 'bolt', but got " + value.getClass().getSimpleName());
      case SPOUT:
        if (value instanceof SpoutAggregateStats) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type SpoutAggregateStats for field 'spout', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.storm.thrift.protocol.TProtocol iprot, org.apache.storm.thrift.protocol.TField field) throws org.apache.storm.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case BOLT:
          if (field.type == BOLT_FIELD_DESC.type) {
            BoltAggregateStats bolt;
            bolt = new BoltAggregateStats();
            bolt.read(iprot);
            return bolt;
          } else {
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SPOUT:
          if (field.type == SPOUT_FIELD_DESC.type) {
            SpoutAggregateStats spout;
            spout = new SpoutAggregateStats();
            spout.read(iprot);
            return spout;
          } else {
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    switch (setField_) {
      case BOLT:
        BoltAggregateStats bolt = (BoltAggregateStats)value_;
        bolt.write(oprot);
        return;
      case SPOUT:
        SpoutAggregateStats spout = (SpoutAggregateStats)value_;
        spout.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.storm.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.storm.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case BOLT:
          BoltAggregateStats bolt;
          bolt = new BoltAggregateStats();
          bolt.read(iprot);
          return bolt;
        case SPOUT:
          SpoutAggregateStats spout;
          spout = new SpoutAggregateStats();
          spout.read(iprot);
          return spout;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    switch (setField_) {
      case BOLT:
        BoltAggregateStats bolt = (BoltAggregateStats)value_;
        bolt.write(oprot);
        return;
      case SPOUT:
        SpoutAggregateStats spout = (SpoutAggregateStats)value_;
        spout.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.storm.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case BOLT:
        return BOLT_FIELD_DESC;
      case SPOUT:
        return SPOUT_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.storm.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public BoltAggregateStats get_bolt() {
    if (getSetField() == _Fields.BOLT) {
      return (BoltAggregateStats)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'bolt' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_bolt(BoltAggregateStats value) {
    setField_ = _Fields.BOLT;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.BOLT");
  }

  public SpoutAggregateStats get_spout() {
    if (getSetField() == _Fields.SPOUT) {
      return (SpoutAggregateStats)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'spout' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_spout(SpoutAggregateStats value) {
    setField_ = _Fields.SPOUT;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.SPOUT");
  }

  public boolean is_set_bolt() {
    return setField_ == _Fields.BOLT;
  }


  public boolean is_set_spout() {
    return setField_ == _Fields.SPOUT;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof SpecificAggregateStats) {
      return equals((SpecificAggregateStats)other);
    } else {
      return false;
    }
  }

  public boolean equals(SpecificAggregateStats other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(SpecificAggregateStats other) {
    int lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.storm.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.storm.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.storm.thrift.TEnum) {
        list.add(((org.apache.storm.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
