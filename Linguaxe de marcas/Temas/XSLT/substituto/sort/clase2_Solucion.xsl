<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
      <h1>Productos</h1>
       <xsl:for-each select="inventario/producto">
       <xsl:sort select="@codigo" order="descending"/>
       <p>Producto: <xsl:value-of select="@codigo"/></p>
       <p>Nombre: <xsl:value-of select="nombre"/></p>
       <p>Peso: <xsl:value-of select="peso"/> <xsl:value-of select="peso/@unidad"/></p>
       <p>Precio: <xsl:value-of select="precio"/></p>
       <p>Unidades: <xsl:value-of select="unidades"/></p>
       </xsl:for-each>
       <p>-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>
<xsl:for-each select="inventario/producto">
       <xsl:sort select="@codigo" order="ascending"/>
       <p>Producto: <xsl:value-of select="@codigo"/></p>
       <p>Nombre: <xsl:value-of select="nombre"/></p>
       <p>Peso: <xsl:value-of select="peso"/> <xsl:value-of select="peso/@unidad"/></p>
       <p>Precio: <xsl:value-of select="precio"/></p>
       <p>Unidades: <xsl:value-of select="unidades"/></p>
       </xsl:for-each>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>