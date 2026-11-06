const pauProfile = {
    nombre: "Pau Joli Diaz",
    rol: "Estudiante de DAW y Máster en Ciberseguridad",
    pasiones: ["Ordenadores", "Java", "Desarrollo Web", "Ciberseguridad"],
    
    presentarse: function() {
        console.log(`%c ¡Hola que tal! 👋 Soy ${this.nombre} `, 'background: #222; color: #bada55; padding: 4px; font-size: 14px; border-radius: 4px;');
        console.log(`🎓 Formación: ${this.rol}`);
        console.log(`💻 Lo que me apasiona: ${this.pasiones.join(" | ")}`);
        console.log("✨ ¡Sigue explorando mis repositorios y código!");
    }
};

// Ejecutamos la presentación
pauProfile.presentarse();