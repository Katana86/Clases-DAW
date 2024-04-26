﻿<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
       <h2>Inventario de productos</h2>
       <table border="1">
       <tr bgcolor="white">
        <th>Nombre</th>
        <th>Marca</th>
        <th>Categoría</th>
        <th>Precio</th>
        <th>Disponibilidad</th>
       <xsl:for-each select="inventario/item">
       <xsl:sort select="available" order="descending"/>
        <tr>
         <td><xsl:value-of select="name"/></td>
         <td><xsl:value-of select="brand"/></td>
         <td><xsl:value-of select="category"/></td>
         <td>$ <xsl:value-of select="price"/></td>
         <xsl:if test="available = string('true')">
         <td color="#30ff06">Disponible</td>
        </xsl:if>
        <xsl:if test="available = string('false')">
         <td color="#ff0606">Agotado</td>
        </xsl:if>
        </tr>
       </xsl:for-each>
       </tr>
       </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>