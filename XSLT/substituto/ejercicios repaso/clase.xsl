<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/library">
<html> 
<body>
  <h1> Library Catalog </h1>
  <xsl:for-each select="book">
   <xsl:sort select="book" order="descending"/>
   <h2> Titulo del libro: <xsl:value-of select="title"/></h2>
   <h3> Autor: <xsl:value-of select="author"/><xsl:text> - </xsl:text> Genero: <xsl:value-of select="genre"/></h3>
   <h3> Precio: $<xsl:value-of select="price"/></h3>
   <xsl:if test="available = string('true')">
    <p color="#30ff06">Avaliable/Disponible</p>
   </xsl:if>
   <xsl:if test="available = string('false')">
    <p color="#ff0606">Out of stock</p>
   </xsl:if>
   <h4> Reviews: </h4>
   <xsl:for-each select="reviews/review">
   <ul>
    <li><xsl:value-of select="user"/><xsl:text>:</xsl:text> <xsl:value-of select="comment"/></li>
   </ul>
   </xsl:for-each>
  </xsl:for-each>
    <table border="1">
   <tr bgcolor="black">
    <th>Titulo</th>
    <th>Autor</th>
    <th>Genero</th>
    <th>Precio</th>
    <th>Disponibilidad</th>
    <th>Reviews</th>
   <xsl:for-each select="book">
   <tr>
    <td><xsl:value-of select="title"/></td>
    <td><xsl:value-of select="author"/></td>
    <td><xsl:value-of select="genre"/></td>
    <td>$<xsl:value-of select="price"/></td>
    <xsl:if test="available = string('true')">
    <td color="#30ff06">Avaliable/Disponible</td>
   </xsl:if>
   <xsl:if test="available = string('false')">
    <td color="#ff0606">Out of stock/No disponible</td>
   </xsl:if>
   <xsl:for-each select="reviews">
   <td>
    <ul>
    <li><xsl:value-of select="review"/></li>
   </ul>
    </td>
   </tr>
    </xsl:for-each>
   </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>