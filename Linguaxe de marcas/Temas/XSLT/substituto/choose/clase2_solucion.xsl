<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h2>Inventario</h2>
  <xsl:for-each select="inventario/producto">
  <xsl:if test="precio&gt;5">
  <p>nombre: <xsl:value-of select="nombre"/></p>
  <p>codigo: <xsl:value-of select="@codigo"/></p>
  <p>peso: <xsl:value-of select="peso"/><xsl:text> </xsl:text> <xsl:value-of select="peso/@unidad"/></p>
  <p>precio: <xsl:value-of select="precio"/></p>
  <p>unidades: <xsl:value-of select="unidades"/></p>
</xsl:if>
  </xsl:for-each>
</body>
</html>
</xsl:template>
</xsl:stylesheet>

