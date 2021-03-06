package ru.korgov.intellij.fugen.properties;

/**
 * Author: Kirill Korgov (kirill@korgov.ru))
 * Date: 20.02.13 3:48
 */
public class GeneratorPropertiesState implements PropertiesState {

    private String generatorName = Constants.DEFAULT_GENERATOR_NAME;

    private String fuClassName = Constants.DEFAULT_FU_CLASS_NAME;
    private String fuFieldTemplate = Constants.DEFAULT_FU_FIELD_TEMPLATE;
    private String fuMethodTemplate = Constants.DEFAULT_FU_METHOD_TEMPLATE;

    private boolean fieldTemplateEnabled = true;
    private boolean methodTemplateEnabled = false;

    public GeneratorPropertiesState() {
    }

    public GeneratorPropertiesState(final String generatorName) {
        this.generatorName = generatorName;
    }

    @Override
    public boolean isFieldTemplateEnabled() {
        return fieldTemplateEnabled;
    }

    public void setFieldTemplateEnabled(final boolean fieldTemplateEnabled) {
        this.fieldTemplateEnabled = fieldTemplateEnabled;
    }

    @Override
    public boolean isMethodTemplateEnabled() {
        return methodTemplateEnabled;
    }

    public void setMethodTemplateEnabled(final boolean methodTemplateEnabled) {
        this.methodTemplateEnabled = methodTemplateEnabled;
    }

    @Override
    public String getFuClassName() {
        return fuClassName;
    }

    public void setFuClassName(final String fuClassName) {
        this.fuClassName = fuClassName;
    }

    @Override
    public String getGeneratorName() {
        return generatorName;
    }

    public void setGeneratorName(final String generatorName) {
        this.generatorName = generatorName;
    }

    @Override
    public String getFuFieldTemplate() {
        return fuFieldTemplate;
    }

    @Override
    public String getFuMethodTemplate() {
        return fuMethodTemplate;
    }

    public void setFuMethodTemplate(final String fuMethodTemplate) {
        this.fuMethodTemplate = fuMethodTemplate;
    }

    public void setFuFieldTemplate(final String fuFieldTemplate) {
        this.fuFieldTemplate = fuFieldTemplate;
    }

//    @Override
//    @SuppressWarnings("ReturnOfThis")
//    public GeneratorPropertiesState getState() {
//        return this;
//    }
//
//    @Override
//    public void loadState(final GeneratorPropertiesState state) {
//        XmlSerializerUtil.copyBean(state, this);
//    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final GeneratorPropertiesState that = (GeneratorPropertiesState) o;

        if (fieldTemplateEnabled != that.fieldTemplateEnabled) return false;
        if (methodTemplateEnabled != that.methodTemplateEnabled) return false;
        if (fuClassName != null ? !fuClassName.equals(that.fuClassName) : that.fuClassName != null) return false;
        if (fuFieldTemplate != null ? !fuFieldTemplate.equals(that.fuFieldTemplate) : that.fuFieldTemplate != null)
            return false;
        if (fuMethodTemplate != null ? !fuMethodTemplate.equals(that.fuMethodTemplate) : that.fuMethodTemplate != null)
            return false;
        if (generatorName != null ? !generatorName.equals(that.generatorName) : that.generatorName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = generatorName != null ? generatorName.hashCode() : 0;
        result = 31 * result + (fuClassName != null ? fuClassName.hashCode() : 0);
        result = 31 * result + (fuFieldTemplate != null ? fuFieldTemplate.hashCode() : 0);
        result = 31 * result + (fuMethodTemplate != null ? fuMethodTemplate.hashCode() : 0);
        result = 31 * result + (fieldTemplateEnabled ? 1 : 0);
        result = 31 * result + (methodTemplateEnabled ? 1 : 0);
        return result;
    }

    public GeneratorPropertiesState copy() {
        final GeneratorPropertiesState out = new GeneratorPropertiesState();
        out.setGeneratorName(generatorName);
        out.setFuClassName(fuClassName);
        out.setFuFieldTemplate(fuFieldTemplate);
        out.setFuMethodTemplate(fuMethodTemplate);
        out.setFieldTemplateEnabled(fieldTemplateEnabled);
        out.setMethodTemplateEnabled(methodTemplateEnabled);
        return out;
    }

    public static GeneratorPropertiesState empty() {
        final GeneratorPropertiesState out = new GeneratorPropertiesState();
        out.setGeneratorName("");
        out.setFuClassName("");
        out.setFuFieldTemplate("");
        out.setFuMethodTemplate("");
        out.setFieldTemplateEnabled(false);
        out.setMethodTemplateEnabled(false);
        return out;
    }
}
