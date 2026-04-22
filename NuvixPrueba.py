#TAREA
import numpy as np
import matplotlib.pyplot as plt
# Generar valores de x
x = np.linspace(-5, 5, 15)
# Definir funciones
y1 = x**2
y2 = 2*x+ 1
y3 = np.power(x, 3)
y4 = np.sin(x)
y5 = np.exp(-x)
# Crear figura
plt.figure()
# Gr´afica de l´ınea
plt.plot(x, y1,color = "red", label="y=x^2")
plt.plot(x, y3, label="y=x^3")
plt.plot(x, y4, color="Green",label="y = sin(x)")
# Gr´afica de dispersi´on
plt.scatter(x, y2,color = "Purple", label="y=2x+1")
plt.scatter(x, y5,color = "Brown", label="y=e^−x")
# Etiquetas y t´ıtulo
plt.xlabel("Eje X")
plt.ylabel("Eje Y")
plt.title("Gráficas combinadas")
plt.legend()
plt.grid()
plt.show()