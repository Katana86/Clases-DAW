<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
       <h2>Inventario de productos</h2>
       <xsl:for-each select="inventario/item">
        <xsl:sort select="name" order="ascending"/>
        <h1><xsl:value-of select="name"/></h1>
          <img>
            <xsl:attribute name="src">
              <xsl:value-of select="imagen"/>
            </xsl:attribute>
          </img>
        <p><xsl:value-of select="brand"/><xsl:text> - </xsl:text><xsl:value-of select="category"/></p>
        <p>Precio: $<xsl:value-of select="price"/></p>
        <xsl:if test="available = 'true'">
         <p color="#30ff06">Disponible</p>
        </xsl:if>
        <xsl:if test="available = 'false'">
         <p color="#ff0606">Agotado</p>
        </xsl:if>
       </xsl:for-each>
       <table border="1">
       <tr bgcolor="white">
        <th>Nombre</th>
        <th>Marca</th>
        <th>Categoría</th>
        <th>Precio</th>
        <th>Disponibilidad</th>
        </tr>
       <xsl:for-each select="inventario/item">
       <xsl:sort select="available" order="descending"/>
        <tr>
         <td><xsl:value-of select="name"/></td>
         <td><xsl:value-of select="brand"/></td>
         <td><xsl:value-of select="category"/></td>
         <td>$ <xsl:value-of select="price"/></td>
         <xsl:if test="available = 'true'">
         <td color="#30ff06">Disponible</td>
        </xsl:if>
        <xsl:if test="available = 'false'">
         <td color="#ff0606">Agotado</td>
        </xsl:if>
        </tr>
       </xsl:for-each>
       </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>