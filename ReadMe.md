# Aplikasi todolist 
### Implementasi Clean Architecture
- Layer
    - Entity
      - data
    - Repository
      - Bisnis logic 
        - agar logic ini bisa di ganti tanpa perlu ubah dari service.
      - Kontrak method
    - Service
      - Bisnis logic
      - Data representation
      - kontrak method
      - Implementation method from service _(override service)_
    - View

      