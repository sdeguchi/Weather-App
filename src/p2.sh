#!/bin/bash

javac -cp ".:javassist.jar" ./Weather.java ./Java2sAutoTextField.java ./Java2sAutoComboBox.java ./APIrequest.java ./City.java ./WeatherGUI.java ./com/google/gson/JsonElement.java ./com/google/gson/TypeAdapter.java ./com/google/gson/JsonSyntaxException.java ./com/google/gson/JsonIOException.java ./com/google/gson/JsonStreamParser.java ./com/google/gson/FieldAttributes.java ./com/google/gson/JsonSerializationContext.java ./com/google/gson/JsonPrimitive.java ./com/google/gson/stream/JsonReader.java ./com/google/gson/stream/JsonToken.java ./com/google/gson/stream/MalformedJsonException.java ./com/google/gson/stream/JsonWriter.java ./com/google/gson/stream/JsonScope.java ./com/google/gson/FieldNamingPolicy.java ./com/google/gson/JsonDeserializationContext.java ./com/google/gson/FieldNamingStrategy.java ./com/google/gson/JsonSerializer.java ./com/google/gson/annotations/Until.java ./com/google/gson/annotations/SerializedName.java ./com/google/gson/annotations/Since.java ./com/google/gson/annotations/Expose.java ./com/google/gson/annotations/package-info.java ./com/google/gson/annotations/JsonAdapter.java ./com/google/gson/DefaultDateTypeAdapter.java ./com/google/gson/TypeAdapterFactory.java ./com/google/gson/reflect/package-info.java ./com/google/gson/reflect/TypeToken.java ./com/google/gson/package-info.java ./com/google/gson/LongSerializationPolicy.java ./com/google/gson/JsonArray.java ./com/google/gson/JsonDeserializer.java ./com/google/gson/JsonObject.java ./com/google/gson/Gson.java ./com/google/gson/JsonParser.java ./com/google/gson/internal/UnsafeAllocator.java ./com/google/gson/internal/bind/CollectionTypeAdapterFactory.java ./com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper.java ./com/google/gson/internal/bind/JsonTreeReader.java ./com/google/gson/internal/bind/MapTypeAdapterFactory.java ./com/google/gson/internal/bind/ObjectTypeAdapter.java ./com/google/gson/internal/bind/TimeTypeAdapter.java ./com/google/gson/internal/bind/DateTypeAdapter.java ./com/google/gson/internal/bind/ReflectiveTypeAdapterFactory.java ./com/google/gson/internal/bind/JsonTreeWriter.java ./com/google/gson/internal/bind/TypeAdapters.java ./com/google/gson/internal/bind/util/ISO8601Utils.java ./com/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory.java ./com/google/gson/internal/bind/SqlDateTypeAdapter.java ./com/google/gson/internal/bind/ArrayTypeAdapter.java ./com/google/gson/internal/bind/TreeTypeAdapter.java ./com/google/gson/internal/PreJava9DateFormatProvider.java ./com/google/gson/internal/LinkedTreeMap.java ./com/google/gson/internal/ConstructorConstructor.java ./com/google/gson/internal/ObjectConstructor.java ./com/google/gson/internal/LazilyParsedNumber.java ./com/google/gson/internal/reflect/UnsafeReflectionAccessor.java ./com/google/gson/internal/reflect/ReflectionAccessor.java ./com/google/gson/internal/reflect/PreJava9ReflectionAccessor.java ./com/google/gson/internal/package-info.java ./com/google/gson/internal/Primitives.java ./com/google/gson/internal/Streams.java ./com/google/gson/internal/Excluder.java './com/google/gson/internal/$Gson$Preconditions.java' ./com/google/gson/internal/LinkedHashTreeMap.java ./com/google/gson/internal/JsonReaderInternalAccess.java './com/google/gson/internal/$Gson$Types.java' ./com/google/gson/GsonBuilder.java ./com/google/gson/InstanceCreator.java ./com/google/gson/JsonParseException.java ./com/google/gson/util/VersionUtils.java ./com/google/gson/JsonNull.java ./com/google/gson/ExclusionStrategy.java ./com/fasterxml/jackson/annotation/JsonView.java ./com/fasterxml/jackson/annotation/JsonSetter.java ./com/fasterxml/jackson/annotation/JsonUnwrapped.java ./com/fasterxml/jackson/annotation/JsonProperty.java ./com/fasterxml/jackson/annotation/JsonTypeInfo.java ./com/fasterxml/jackson/annotation/ObjectIdResolver.java ./com/fasterxml/jackson/annotation/JsonIdentityInfo.java ./com/fasterxml/jackson/annotation/JsonValue.java ./com/fasterxml/jackson/annotation/JsonIgnoreProperties.java ./com/fasterxml/jackson/annotation/JsonSubTypes.java ./com/fasterxml/jackson/annotation/OptBoolean.java ./com/fasterxml/jackson/annotation/JacksonInject.java ./com/fasterxml/jackson/annotation/JsonTypeId.java ./com/fasterxml/jackson/annotation/ObjectIdGenerator.java ./com/fasterxml/jackson/annotation/JsonPropertyOrder.java ./com/fasterxml/jackson/annotation/JsonAnyGetter.java ./com/fasterxml/jackson/annotation/JacksonAnnotationValue.java ./com/fasterxml/jackson/annotation/Nulls.java ./com/fasterxml/jackson/annotation/JsonAnySetter.java ./com/fasterxml/jackson/annotation/package-info.java ./com/fasterxml/jackson/annotation/JsonFormat.java ./com/fasterxml/jackson/annotation/ObjectIdGenerators.java ./com/fasterxml/jackson/annotation/JsonPropertyDescription.java ./com/fasterxml/jackson/annotation/JsonAlias.java ./com/fasterxml/jackson/annotation/JsonRawValue.java ./com/fasterxml/jackson/annotation/JsonIdentityReference.java ./com/fasterxml/jackson/annotation/JsonBackReference.java ./com/fasterxml/jackson/annotation/JsonIgnore.java ./com/fasterxml/jackson/annotation/JsonGetter.java ./com/fasterxml/jackson/annotation/PropertyAccessor.java ./com/fasterxml/jackson/annotation/JacksonAnnotation.java ./com/fasterxml/jackson/annotation/JsonManagedReference.java ./com/fasterxml/jackson/annotation/JsonTypeName.java ./com/fasterxml/jackson/annotation/JsonAutoDetect.java ./com/fasterxml/jackson/annotation/JsonFilter.java ./com/fasterxml/jackson/annotation/JsonEnumDefaultValue.java ./com/fasterxml/jackson/annotation/JsonIgnoreType.java ./com/fasterxml/jackson/annotation/JsonCreator.java ./com/fasterxml/jackson/annotation/JsonClassDescription.java ./com/fasterxml/jackson/annotation/SimpleObjectIdResolver.java ./com/fasterxml/jackson/annotation/JacksonAnnotationsInside.java ./com/fasterxml/jackson/annotation/JsonRootName.java ./com/fasterxml/jackson/annotation/JsonInclude.java ./com/fasterxml/jackson/annotation/JsonMerge.java ./com/jsoniter/JsonIteratorPool.java ./com/jsoniter/DynamicCodegen.java ./com/jsoniter/CodegenImplEnum.java ./com/jsoniter/IterImplArray.java ./com/jsoniter/IterImpl.java ./com/jsoniter/CodegenAccess.java ./com/jsoniter/JsonIterator.java ./com/jsoniter/extra/Base64.java ./com/jsoniter/extra/GsonCompatibilityMode.java ./com/jsoniter/extra/JdkDatetimeSupport.java ./com/jsoniter/extra/Base64FloatSupport.java ./com/jsoniter/extra/PreciseFloatSupport.java ./com/jsoniter/extra/JacksonCompatibilityMode.java ./com/jsoniter/extra/Base64Support.java ./com/jsoniter/extra/NamingStrategySupport.java ./com/jsoniter/CodegenImplObjectStrict.java ./com/jsoniter/static_codegen/StaticCodegenConfig.java ./com/jsoniter/static_codegen/StaticCodegen.java ./com/jsoniter/any/MapWrapperAny.java ./com/jsoniter/any/DoubleAny.java ./com/jsoniter/any/Any.java ./com/jsoniter/any/ArrayWrapperAny.java ./com/jsoniter/any/NotFoundAny.java ./com/jsoniter/any/NullAny.java ./com/jsoniter/any/LongLazyAny.java ./com/jsoniter/any/ArrayAny.java ./com/jsoniter/any/FloatAny.java ./com/jsoniter/any/FalseAny.java ./com/jsoniter/any/ObjectAny.java ./com/jsoniter/any/ObjectLazyAny.java ./com/jsoniter/any/DoubleLazyAny.java ./com/jsoniter/any/StringAny.java ./com/jsoniter/any/ArrayLazyAny.java ./com/jsoniter/any/StringLazyAny.java ./com/jsoniter/any/TrueAny.java ./com/jsoniter/any/LongAny.java ./com/jsoniter/any/IntAny.java ./com/jsoniter/any/LazyAny.java ./com/jsoniter/any/ListWrapperAny.java ./com/jsoniter/ReflectionObjectDecoder.java ./com/jsoniter/annotation/JsonProperty.java ./com/jsoniter/annotation/JsonUnwrapper.java ./com/jsoniter/annotation/JsonMissingProperties.java ./com/jsoniter/annotation/JsonWrapperType.java ./com/jsoniter/annotation/JsonExtraProperties.java ./com/jsoniter/annotation/JsonWrapper.java ./com/jsoniter/annotation/JsonIgnore.java ./com/jsoniter/annotation/JsonObject.java ./com/jsoniter/annotation/JsonCreator.java ./com/jsoniter/ReflectionEnumDecoder.java ./com/jsoniter/CodegenImplNative.java ./com/jsoniter/IterImplSkip.java ./com/jsoniter/output/ReflectionMapEncoder.java ./com/jsoniter/output/DynamicCodegen.java ./com/jsoniter/output/StreamImplString.java ./com/jsoniter/output/CodegenAccess.java ./com/jsoniter/output/JsonStream.java ./com/jsoniter/output/CodegenResult.java ./com/jsoniter/output/EncodingMode.java ./com/jsoniter/output/ReflectionArrayEncoder.java ./com/jsoniter/output/DefaultMapKeyEncoder.java ./com/jsoniter/output/CodegenImplNative.java ./com/jsoniter/output/ReflectionObjectEncoder.java ./com/jsoniter/output/ReflectionEncoderFactory.java ./com/jsoniter/output/CodegenImplArray.java ./com/jsoniter/output/StreamImplNumber.java ./com/jsoniter/output/ReflectionEnumEncoder.java ./com/jsoniter/output/ReflectionCollectionEncoder.java ./com/jsoniter/output/CodegenImplMap.java ./com/jsoniter/output/CodegenImplObject.java ./com/jsoniter/output/ReflectionListEncoder.java ./com/jsoniter/output/JsonStreamPool.java ./com/jsoniter/output/Codegen.java ./com/jsoniter/fuzzy/StringShortDecoder.java ./com/jsoniter/fuzzy/MaybeStringShortDecoder.java ./com/jsoniter/fuzzy/StringLongDecoder.java ./com/jsoniter/fuzzy/MaybeStringDoubleDecoder.java ./com/jsoniter/fuzzy/StringDoubleDecoder.java ./com/jsoniter/fuzzy/MaybeEmptyArrayDecoder.java ./com/jsoniter/fuzzy/MaybeStringIntDecoder.java ./com/jsoniter/fuzzy/MaybeStringLongDecoder.java ./com/jsoniter/fuzzy/StringFloatDecoder.java ./com/jsoniter/fuzzy/MaybeStringFloatDecoder.java ./com/jsoniter/fuzzy/StringIntDecoder.java ./com/jsoniter/IterImplObject.java ./com/jsoniter/IterImplNumber.java ./com/jsoniter/CodegenImplArray.java ./com/jsoniter/spi/Encoder.java ./com/jsoniter/spi/GenericsHelper.java ./com/jsoniter/spi/DecodingMode.java ./com/jsoniter/spi/MapKeyDecoder.java ./com/jsoniter/spi/Config.java ./com/jsoniter/spi/WrapperDescriptor.java ./com/jsoniter/spi/EmptyExtension.java ./com/jsoniter/spi/UnwrapperDescriptor.java ./com/jsoniter/spi/Extension.java ./com/jsoniter/spi/OmitValue.java ./com/jsoniter/spi/Slice.java ./com/jsoniter/spi/ConstructorDescriptor.java ./com/jsoniter/spi/EncodeTo.java ./com/jsoniter/spi/JsoniterSpi.java ./com/jsoniter/spi/ClassDescriptor.java ./com/jsoniter/spi/Binding.java ./com/jsoniter/spi/Decoder.java ./com/jsoniter/spi/ClassInfo.java ./com/jsoniter/spi/JsonException.java ./com/jsoniter/spi/MapKeyEncoder.java ./com/jsoniter/spi/TypeLiteral.java ./com/jsoniter/CodegenImplObjectHash.java ./com/jsoniter/ReflectionMapDecoder.java ./com/jsoniter/ReflectionDecoderFactory.java ./com/jsoniter/DefaultMapKeyDecoder.java ./com/jsoniter/IterImplString.java ./com/jsoniter/ReflectionArrayDecoder.java ./com/jsoniter/CodegenImplMap.java ./com/jsoniter/ValueType.java ./com/jsoniter/IterImplForStreaming.java ./com/jsoniter/ReflectionCollectionDecoder.java ./com/jsoniter/Codegen.java