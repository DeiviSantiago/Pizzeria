Ejemplo del mundo real

Este proyecto implementa el patrón de diseño Decorador para la personalización de pizzas, tal como se utiliza en pizzerías reales para calcular precios y gestionar ingredientes extra de forma flexible y extensible.​

El sistema parte de una pizza base (con tamaños y precios reales) y permite al usuario añadir ingredientes como queso, pepperoni, aceitunas y tocineta, cada uno modelado como decoradores que envuelven el objeto pizza principal. Al agregar ingredientes, el sistema suma automáticamente la descripción y el costo de forma dinámica, evitando la necesidad de crear una clase nueva para cada posible combinación de ingredientes.​

Este enfoque es ampliamente usado en proyectos reales para tiendas y restaurantes, ya que facilita el mantenimiento, la extensión y la lógica de precios de productos personalizables, reflejando la manera en que se construyen y venden pizzas en el mundo real. El patrón decorador permite así construir pizzas a la medida del cliente, sumando ingredientes sin modificar la estructura base del sistema, lo que simplifica el desarrollo y la incorporación de nuevos ingredientes.​